public class Kata {
    public static int[][] matrixAddition(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                a[i][j] += b[i][j];
            }
        }
        return a;
    }
}