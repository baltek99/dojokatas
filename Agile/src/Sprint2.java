public class Sprint2 {
    public int multi(int x, int y) {
        int counter = 0;
        for (int i = 0; i < x; i++) {
            counter = Add.add(counter, y);
        }
        return counter;
    }

    public int delta(int a, int b, int c) {
        int delta = multi(b, b);
        int tmp = multi(4, a);
        tmp = multi(tmp, c);
        delta = Add.add(delta, -tmp);
        if (delta < 0) return 0;
        else if (delta == 0) return 1;
        else return 2;
    }

    public int nthSmallest(int[] num, int n) {
        if (n >= num.length || n < 0) throw new IllegalArgumentException();
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        return num[n];
    }

    public String seq(char[] word1, char[] word2) {
        String s1 = new String(word1);
        String s2 = new String(word2);
        String result = "";
        int max = Math.min(word1.length, word2.length);
        for (int x = 1; x <= max; x++) {
            for (int i = 0; i < word2.length - x + 1; i++) {
                for (int j = 0; j < word1.length - x + 1; j++) {
                    String tmp1 = s1.substring(j, j + x);
                    String tmp2 = s2.substring(i, i + x);
                    if (tmp1.equals(tmp2) && result.length() < x) {
                        result = tmp1;
                    }
                }
            }
        }
        return result;
    }
}
