import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class OrdersSummary {
    public static String balanceStatements(String lst) {

        //"GOOG 300 542.0 B" b-buy, s-sell

        String[] listOfOrders = lst.split(",");
        String[][] orders = new String[listOfOrders.length][4];
        double buy = 0;
        double sell = 0;

        for (int i = 0; i < listOfOrders.length; i++) {
            String[] order = listOfOrders[i].split(" ");
            if (order[0].equals("") && order.length > 4) {
                order[0] = order[1];
                order[1] = order[2];
                order[2] = order[3];
                order[3] = order[4];
            }
            for (int j = 0; j < 4; j++) {
                orders[i][j] = order[j];
            }
        }

        for (int i = 0; i < orders.length; i++) {
            if (orders[i][3].equals("B")) {
                buy += Integer.parseInt(orders[i][1]) * Double.parseDouble(orders[i][2]);
            }
            else if (orders[i][3].equals("S")) {
                sell += Integer.parseInt(orders[i][1]) * Double.parseDouble(orders[i][2]);
            }
            else
                return "Badly formed";
        }


        return "Buy: " + buy + " Sell: " + sell;
    }
    private static boolean isOrderCorrect(String[] order) {
        return false;
    }
    public static void main(String[] args) {
        String l = "ZNGA 1300 2.66 B, CLH15.NYM 50 56.32 B, OWW 1000 11.623 B, OGG 20 580.1 B";
        System.out.println(balanceStatements(l));
        l = "ZNGA 1300 2.66 B, CLH15.NYM 50 56.32 S, OWW 1000 11.623 B, OGG 20 580.1 B";
        System.out.println(balanceStatements(l));

    }
}
