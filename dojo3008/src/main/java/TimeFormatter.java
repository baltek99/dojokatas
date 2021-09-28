import java.util.*;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if(seconds == 0) return "now";

        int years = seconds / 31536000;
        seconds -= years * 31536000;
        int days = seconds / 86400;
        seconds -= days * 86400;
        int hours = seconds / 3600;
        seconds -= hours * 3600;
        int minutes = seconds / 60;
        seconds -= minutes * 60;

        StringBuilder sb = new StringBuilder();

        Stack<String> stack = createStack(years, days, hours, minutes, seconds);

        if (years == 1) sb.append(years + " year ");
        else if (years != 0) sb.append(years + " years ");

        if (days == 1) sb.append(days + " day ");
        else if (days != 0) sb.append(days + " days ");

        if (hours == 1) sb.append(hours + " hour ");
        else if (hours != 0) sb.append(hours + " hours ");

        if (minutes == 1) sb.append(minutes + " minute ");
        else if (minutes != 0) sb.append(minutes + "minutes");

        if (seconds == 1) sb.append(seconds + " second");
        else if (seconds != 0) sb.append(seconds + " seconds");

        return sb.toString();
    }
    private static Stack<String> createStack(int y, int d, int h, int m, int s) {
        Stack<String> stack = new Stack<>();
        int counter = howManyNotZero(new int[] {y, d, h, m, s});
        if (s == 1) stack.push(s + "second");
        else if (s != 0) stack.push(s + "seconds");
        //if (counter > 1)
        return null;
    }
    private static int howManyNotZero(int[] tab) {
        int c = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0) c++;
        }
        return c;
    }
    public static void main(String[] args) {
        //System.out.println(formatDuration(62));
        //System.out.println(formatDuration(3600));
        //System.out.println(formatDuration(3662));
        Date date = new GregorianCalendar().getTime();
        System.out.println(date);
    }
}
