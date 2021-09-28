import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {

    private int[][] matrix;
    List<int[]> zeros;

    public Solution(int m, int n) {
        matrix = new int[m][n];
        zeros = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0)
                    zeros.add(new int[] { i , j });
            }
        }
    }

//    public int[] flip() {
//        Random rand = new Random();
//        List<int[]> zeros = new ArrayList<>();
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == 0)
//                    zeros.add(new int[] { i , j });
//            }
//        }
//
//        int r = rand.nextInt(zeros.size());
//
//        matrix[zeros.get(r)[0]][zeros.get(r)[1]] = 1;
//
//        return zeros.get(r);
//    }


    public int[] flip() {
        if (zeros.size() == 0) {
            return new int[] {};
        } else if (zeros.size() == 1) {
            return zeros.get(0);
        }

        Random rand = new Random();
        int r = rand.nextInt(zeros.size());

        matrix[zeros.get(r)[0]][zeros.get(r)[1]] = 1;
        int[] res = zeros.get(r);
        zeros.remove(r);
        return res;
    }

    public void reset() {
        matrix = new int[matrix.length][matrix[0].length];
    }
}
