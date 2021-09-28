public class Door {
    public static void main(String[] args) {
        System.out.println(run(".P.......P.P..P..."));
    }

    public static String run(String events) {
        StringBuilder result = new StringBuilder();
        boolean isDoorOpening = false;
        boolean isDoorClosing = false;
        boolean isDoorOpen = false;
        boolean isDoorClose = true;
        boolean wasDoorOpening = false;
        boolean wasDoorClosing = false;
        int counter = 0;
        for (int i = 0; i < events.length(); i++) {
            if (events.charAt(i) == 'P') {
                if (isDoorOpening) {
                    isDoorOpening = false;
                    wasDoorOpening = true;
                } else if (isDoorClosing) {
                    isDoorClosing = false;
                    wasDoorClosing = true;
                } else if (isDoorOpen) {
                    isDoorClosing = true;
                    isDoorOpen = false;
                } else if (isDoorClose) {
                    isDoorOpening = true;
                    isDoorClose = false;
                } else if (wasDoorOpening) {
                    isDoorOpening = true;
                } else if (wasDoorClosing) {
                    isDoorClosing = true;
                }
            }

            if (isDoorOpening || isDoorClosing) {
                if ((counter == 5 && isDoorOpening) || (counter == 0 && isDoorClosing)) {
                    if (isDoorOpening) isDoorOpen = true;
                    else isDoorClose = true;

                    isDoorClosing = false;
                    isDoorOpening = false;
                    result.append(counter);
                } else {
                    if (events.charAt(i) == 'O') {
                        isDoorClosing = !isDoorClosing;
                        isDoorOpening = !isDoorOpening;
                    }
                    if (isDoorOpening) counter++;
                    else counter--;
                    result.append(counter);
                }
            } else {
                result.append(counter);
            }
        }
        return result.toString();
    }
}
