import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        boolean present = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    present = true;
                    break;
                }
            }
            if (!present)
                list.add(a[i]);
            present = false;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}