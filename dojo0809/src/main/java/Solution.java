import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String rangeExtraction(int[] arr) {
        //Solution.rangeExtraction(new int[]
        //{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
        //returns "-6,-3-1,3-5,7-11,14,15,17-20"

        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                if (list.isEmpty()) {
                    sb.append(arr[i]);
                } else {
                    if (list.size() == 1)
                        sb.append(list.get(0)).append(",").append(arr[i]);
                    else
                        sb.append(list.get(0)).append("-").append(arr[i]);
                    list.clear();
                }
            } else if (arr[i] != arr[i + 1] - 1 && list.isEmpty()) {
                sb.append(arr[i]).append(",");
            } else if (arr[i] != arr[i + 1] - 1) {
                if (list.size() == 1)
                    sb.append(list.get(0)).append(",").append(arr[i]).append(",");
                else
                    sb.append(list.get(0)).append("-").append(arr[i]).append(",");
                list.clear();
            } else {
                list.add(arr[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[]
                {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    }
}
