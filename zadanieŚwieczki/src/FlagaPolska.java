public class FlagaPolska {
    public static void main(String args[]) {
        int[] tab = {1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1};
        //sortowanieKulek(tab);
        for (int i = 0; i < tab.length; i++) {
            //System.out.print(tab[i] + " ");
        }
        //mail adam.panasiuk@envelo.pl

        int[] tab3 = {1, 0, -1, 0, 1, 0, 0, 0, 1, 1, -1, -1, -1, 1, 1, -1, 0, 0};
        sortowanie3Kulek2(tab3);
        for (int i = 0; i < tab3.length; i++) {
            System.out.print(tab3[i] + " ");
        }
    }

    public static void sortowanieKulek(int[] tab) {
        int counterB = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                if (i != counterB) {
                    int tmp = tab[counterB];
                    tab[counterB] = tab[i];
                    tab[i] = tmp;
                }
                counterB++;
            }
        }
    }


    public static void sortowanie3Kulek(int[] tab) {
        int leftIndex = 0;
        int rightIndex = tab.length - 1;

        for (int i = 0; i < tab.length; i++) {
            if (leftIndex == rightIndex) break;

            if (tab[i] == -1) {
                int tmp = tab[leftIndex];
                tab[leftIndex] = tab[i];
                tab[i] = tmp;
                leftIndex++;
            }
            if (tab[i] == 1) {
                int tmp = tab[rightIndex];
                tab[rightIndex] = tab[i];
                tab[i] = tmp;
                rightIndex--;

                if (tab[i] == -1) {
                    tmp = tab[leftIndex];
                    tab[leftIndex] = tab[i];
                    tab[i] = tmp;
                    leftIndex++;
                }
            }
        }
    }
    public static void sortowanie3Kulek2(int[] tab) {
        int leftIndex = 0;
        int rightIndex = tab.length - 1;
        int i = 0;
        int j = tab.length - 1;


    }
}
