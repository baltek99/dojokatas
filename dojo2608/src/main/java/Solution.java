public class Solution {
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        String[] hovered = new String[moves.length];
        for (int i = 0; i < moves.length; i++) {
            if (moves[i].equals("up")) {
                if (position[0] == 1) position[0] = 0;
            } else if (moves[i].equals("down")) {
                if (position[0] == 0) position[0] = 1;
            } else if (moves[i].equals("right")) {
                if (position[1] != 5) position[1]++;
                else position[1] = 0;
            } else {
                if (position[1] != 0) position[1]--;
                else position[1] = 5;
            }
            hovered[i] = fighters[position[0]][position[1]];
        }
        return hovered;
    }
}
