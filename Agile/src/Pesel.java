import java.util.Calendar;

public class Pesel {
    public static boolean pesel(int[] tab) {
        boolean czyPrawidlowy = true;
        for (int i : tab) {
            if (i< 0 || i > 9)return false;
        }
        if (tab.length != 11) {
            return false;
        }
        if (sumaKontrolna(tab) && czyDzienPrawidlowy(tab) && czyMiesiacPrawidlowy(tab)) {
            return true;
        }


        return false;
    }

    static boolean czyMiesiacPrawidlowy(int[] tab) {
        if (tab[2] == 0) {
            if (tab[3] < 0 || tab[3] > 9) return false;
            return true;
        } else if (tab[2] == 1) {
            if (tab[3] == 0 || tab[3] == 1 || tab[3] == 2) return true;
            else return false;
        }
        return false;

    }

    static boolean czyDzienPrawidlowy(int[] tab) {
        if (tab[4] > 3) return false;
        //31
        if (tab[2] == 0 && (tab[3] == 1 || tab[3] == 3 || tab[3] == 5 || tab[3] == 7 || tab[3] == 8 || tab[3] == 10 || tab[3] == 12)) {
            if (tab[4] == 3 && tab[5] < 2) return true;
            return false;
        } else if (tab[2] == 0 && tab[3] == 2) {
            if (tab[4] <= 2) return true;
            return false;
        } else {
            if (tab[4] == 3 && tab[5] == 0) return true;
            return false;
        }
    }

    static boolean sumaKontrolna(int[] tab) {
        int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int counter = 0;
        for (int i = 0; i < wagi.length; i++) {
            counter += wagi[i] * tab[i];

        }
        if (counter % 10 == tab[10]) {
            return true;
        }
        return false;
    }
}
