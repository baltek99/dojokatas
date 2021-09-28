public class Fala {
    public static void main(String[] args) {
        drawWave(69);
    }

    private static void drawChar(int i, int j) {
        if (j % 8 == i || j % 8 == 8 - i) {
            System.out.print("*");
        } else
            System.out.print(" ");
    }
    // 0 ---- 0 7 8 14 15 22 23
    // 1 ---- 1 6 9 13 16 21 24
    // 2 ---- 2 5 10 12 17 20
    // 3 ---- 3 4 11 18 19
    public static void drawWave(int n) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                if (n % 25 >= 0 && n % 25 <= 7) {
                    drawBigWave(i);
                }
                else if (n % 25 > 7 && n % 25 <= 14) {
                    drawSmallWave(i);
                }
                else if (n % 25 > 14 && n % 25 <= 22) {
                    drawBigWave(i);
                }
                else {

                }
            }
            System.out.println();
        }
    }
    static void drawBigWave(int i) {

    }
    static void drawSmallWave(int i) {

    }
    private static void drawChar2(int i, int j) {
        if (j % 8 == i || j % 8 == 8 - i) {
            System.out.print("*");
        } else
            System.out.print(" ");
    }

    public static void drawWave2(int n) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    drawChar2(i, j);
                } else if (i == 1) {
                    drawChar2(i, j);
                } else if (i == 2) {
                    drawChar2(i, j);
                } else {
                    drawChar2(i, j);
                }
            }
            System.out.println();
        }
    }
}
