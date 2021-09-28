public class zadanie2 {
    /*Zad 2.
    Napisz metodę
    int biggestSum(int[] tab)
    która zwraca największą sumę elementów znajdujących się obok siebie.

            np. [1, 2, 3, 4] -> 1 + 2 + 3 + 4 = 10
            [1, 2, 3, -4] -> 1 + 2 + 3 = 6
            [1, 2, -3, 4] -> 4, bo każda inna suma byłaby mniejsza
     */
    public static void main(String args[]) {
        int[] t1 = {1, 2, 3, 4};
        int[] t2 = {1, 2, 3, -4};
        int[] t3 = {1, 2, -3, 4};

        System.out.println(biggestSum(t1));
        System.out.println(biggestSum(t2));
        System.out.println(biggestSum(t3));

    }
    static int biggestSum(int[] tab) {
        int biggestSum = 0;
        int currentSum = 0;

        /*for (int i = 0; i < tab.length; i++) {
            for (int j = i; j < tab.length; j++) {
                currentSum += tab[j];
                if (currentSum > biggestSum) {
                    biggestSum = currentSum;
                }
            }
            currentSum = 0;
        }*/

        for (int i = 0; i < tab.length; i++) {
            if (i == 0) {
                biggestSum = tab[i];
            }
            currentSum += tab[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            if (currentSum > biggestSum) {
                biggestSum = currentSum;
            }
        }

        return biggestSum;
    }
}
