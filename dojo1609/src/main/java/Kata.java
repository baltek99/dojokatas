public class Kata {

    public static String high(String s) {
        String[] words = s.split(" ");
        int maxSum = 0;
        String maxWord = "";
        for (String word : words) {
            int sum = 0;
            for (int j = 0; j < word.length(); j++) {
                sum += word.charAt(j) - 96;
            }
            if (sum > maxSum) {
                maxWord = word;
                maxSum = sum;
            }
        }

        return maxWord;
    }
}