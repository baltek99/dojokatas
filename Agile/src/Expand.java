public class Expand {
    static String expand(String num) {
        String[] args = num.split("\\.");
        String left = args[0];
        String right = args[1];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < left.length(); i++) {
            result.append(left.charAt(i));
            for (int j = i; j < left.length(); j++) {
                result.append("0");
            }
            result.append("+");

        }
        for (int i = 0; i < right.length(); i++) {
            result.append(right.charAt(i));
            for (int j = i; j < right.length(); j++) {
                result.append("0");
            }
            result.append("+");
        }
        return result.toString();
    }
}
