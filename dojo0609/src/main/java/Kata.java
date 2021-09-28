import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Kata {
    public static String autocorrect(String input) {
        StringBuilder sb = new StringBuilder();
        String sister = "your sister";
        char last = input.charAt(input.length() - 1);
        boolean isLastAlphabetic = Character.isAlphabetic(last);
        if (!isLastAlphabetic) {
            input = input.substring(0, input.length() - 1);
        }
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (isYou(words[i])) {
                words[i] = sister;
            }
            sb.append(words[i]);
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        if (!isLastAlphabetic) {
            sb.append(last);
        }
        return sb.toString();
    }

    private static boolean isYou(String s) {
        s = s.toLowerCase();
        if (s.equals("u") || s.equals("you")) {
            return true;
        } else if (s.charAt(0) == 'y' && s.charAt(1) == 'o') {
            for (int i = 2; i < s.length(); i++) {
                if (s.charAt(i) != 'u') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws InterruptedException {
        Date d1 = new GregorianCalendar().getTime();
        System.out.println(autocorrect("I miss you!"));
        Thread.sleep(2000);
        Date d2 = new GregorianCalendar().getTime();
        System.out.println(d1 + " " + d2);
        Queue<Integer> q = new ConcurrentLinkedQueue<>();
        
    }
}
