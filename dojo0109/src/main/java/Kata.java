import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static String formatWords(String[] words) {
        if (words == null) return "";
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (!word.equals("")) list.add(word);
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals("")) {
                sb.append(list.get(i));

                if (i + 1 == list.size() - 1) {
                    sb.append(" and ");
                } else if (i != list.size() - 1)
                    sb.append(", ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(formatWords(new String[]{"one", "two", "three", "four"}));
        System.out.println(formatWords(new String[]{"one"}));
        System.out.println(formatWords(new String[]{"one", "", "three"}));
        System.out.println(formatWords(new String[]{"", "", "three"}));
        System.out.println(formatWords(new String[]{"one", "two", ""}));
        System.out.println(formatWords(new String[]{}));
        System.out.println(formatWords(new String[]{""}));
        System.out.println(formatWords(null));
    }
}
