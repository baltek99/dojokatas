public class Power {
    static int power(int x, int y) {
        int p = 1;
        Sprint2 sprint2 = new Sprint2();
        if (y == 0) return 1;
        for (int i = 1; i <= y; i++) {
            p = sprint2.multi(p, x);
        }
        return p;
    }
}
