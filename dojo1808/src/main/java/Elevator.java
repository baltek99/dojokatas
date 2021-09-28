import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Elevator {
    private static int direction; // UP = 1, DOWN = -1
    private static int currentFloor;
    private static List<Integer> lift;
    private static int peopleInLift;

    public static int[] theLift(final int[][] queues, final int capacity) {
        int i = 0;
        List<Integer> floorsLiftStopped = new ArrayList<Integer>();
        direction = 1;
        currentFloor = 0;
        lift = new LinkedList<>();
        peopleInLift = 0;
        //clearLift();
        floorsLiftStopped.add(0);
        if (doesEveryoneWantDown(queues)) i = currentFloor = queues.length - 1;
        while (!isQueuesEmpty(queues) || peopleInLift != 0) {
            boolean flag = false;
            // opróżnianie windy
            int wasInLift = peopleInLift;
            for (int j = 0; j < wasInLift; j++) {
                if (lift.contains(currentFloor)) {
                    lift.remove((Integer) currentFloor);
                    peopleInLift--;
                    if (!flag) {
                        floorsLiftStopped.add(i);
                        flag = true;
                    }
                }
            }
            // przechodzenie po każdej osobie w kolejce
            for (int j = 0; j < queues[i].length; j++) {
                if (queues[i][j] != -1) {
                    if (!flag) {
                        floorsLiftStopped.add(i);
                        flag = true;
                    }
                    // dodawanie do windy
                    if (peopleInLift < capacity) {
                        lift.add(queues[i][j]);
                        queues[i][j] = -1;
                        peopleInLift++;
                    }
                }
            }
            direction = whichDirection(direction);
            if (currentFloor == 0 && direction == -1)
                direction = 1;
            else if (currentFloor == queues.length - 1 && direction == 1)
                direction = -1;
            i += direction;
            currentFloor = i;
        }
        if (floorsLiftStopped.get(floorsLiftStopped.size()-1) != 0) floorsLiftStopped.add(0);
        return floorsLiftStopped.stream().mapToInt(x -> x).toArray();
    }
    private static boolean doesEveryoneWantDown(int[][] queues) {
        for (int floor = 0; floor < queues.length; floor++) {
            for (int man = 0; man < queues[floor].length; man++) {
                if (queues[floor][man] > floor) return false;
            }
        }
        return true;
    }
    private static int whichDirection(int direction) {
        int goUp = 0;
        int goDown = 0;
        for (int people : lift) {
            if (people > currentFloor) goUp++;
            else goDown++;
        }
        if (goUp > goDown) return 1;
        else if (goUp < goDown) return -1;
        else return direction;
    }

    private static boolean isQueuesEmpty(final int[][] queues) {
        for (int floor = 0; floor < queues.length; floor++) {
            for (int people : queues[floor]) {
                if (people != -1) return false;
            }
        }
        return true;
    }

}
