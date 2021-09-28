public class LargestDifference {
    public static int largestDifference(int[] data) {

        int maxDiff = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[j] >= data[i]) {
                    int diff = j - i;
                    if (diff > maxDiff)
                        maxDiff = diff;
                }
            }
        }

        return maxDiff;
    }
}
