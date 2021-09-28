public class Świeczki {
    public static void main(String args[]) {
        System.out.println(czySwieczkaZapalona(16));
        System.out.println(czySwieczkaZapalona(32));

        System.out.println(czySwieczkaZapalona2(16));
        System.out.println(czySwieczkaZapalona2(32));

    }

    public static boolean czySwieczkaZapalona(int x) {
        x -= 1;
        boolean[] swieczki = new boolean[100];

        for (int i = 1; i <= 100; i++) {
            for (int j = 0; j < swieczki.length; j++) {
                if ((j + 1) % (i + 1) == 0) {
                    swieczki[j] = !swieczki[j];
                }
                //System.out.print(swieczki[j] + " ");
            }
            //System.out.println("");
        }

        return swieczki[x];
    }

    public static boolean czySwieczkaZapalona2(int x) {
        boolean swieczka = false;
        for (int i = 1; i <= x; i++) {
            if (x % (1 + i) == 0)
                swieczka = !swieczka;
        }
        return swieczka;
    }

    public static boolean czySwieczkaZapalona3(int x) {
        // rozwiazanie z dzielnikami
        return  false;
    }

}
