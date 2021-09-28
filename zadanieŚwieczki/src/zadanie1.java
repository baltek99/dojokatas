public class zadanie1 {
    /*Napisz metodę
    int longest(int[] tab)
    która zwraca długość najdłuższego fragmentu tablicy składającego się z postępujących po sobie tych samych liczb.
            np. [1, 2, 3, 3, 4, 4, 4, 6] -> 3 (bo są trzy czwórki)
            [1, 1, 2, 3, 4, 5, 5, 6] -> 2 (bo są dwie jedynki i dwie piątki)

    Docelowa złożoność obliczeniowa: O(n)
    pamięciowa: O(1)
    */
    public static void main(String args[]) {
        int[] t1 = {1, 2, 3, 3, 4, 4, 4, 6};
        int[] t2 = {1, 1, 2, 3, 4, 5, 5, 6};

        System.out.println(longest(t1));
        System.out.println(longest(t2));
    }
    static int longest(int[] tab) {
        int howLong = 0;
        int number = 0;
        int longest = 0;

        for (int i = 0; i < tab.length; i++) {
            if (i == 0) number = tab[0];
            if (tab[i] != number) {
                howLong = 0;
                number = tab[i];
            }
            howLong++;
            if (howLong > longest) {
                number = tab[i];
                longest = howLong;
            }
        }
        return longest;
    }

}




