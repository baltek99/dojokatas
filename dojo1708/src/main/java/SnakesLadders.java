public class SnakesLadders {
    private final int[] fields;
    private int player1;
    private int player2;
    private boolean player1ture;
    private boolean sameValueOnDie;
    private boolean isWin;

    public SnakesLadders() {
        player1 = 0;
        player2 = 0;
        player1ture = true;
        sameValueOnDie = false;
        isWin = false;
        fields = new int[101];
        fields[2] = 38;
        fields[7] = 14;
        fields[8] = 31;
        fields[15] = 26;
        fields[16] = 6;
        fields[21] = 42;
        fields[28] = 84;
        fields[36] = 44;
        fields[46] = 25;
        fields[49] = 11;
        fields[51] = 67;
        fields[62] = 19;
        fields[64] = 60;
        fields[71] = 91;
        fields[74] = 53;
        fields[78] = 98;
        fields[87] = 94;
        fields[89] = 68;
        fields[92] = 88;
        fields[95] = 75;
        fields[99] = 80;
    }

    public String play(int die1, int die2) {
        if (isWin) {
            return "Game over!";
        }
        int sum = die1 + die2;
        if (die1 == die2) sameValueOnDie = true;
        else sameValueOnDie = false;

        if (player1ture) {
            player1 += sum;
            if (player1 == 100) {
                isWin = true;
                return "Player 1 Wins!";
            }
            else if (player1 > 100) {
                int goBack = player1 - 100;
                player1 = 100 - goBack;
            }
            if (fields[player1] != 0) player1 = fields[player1];
        } else {
            player2 += sum;
            if (player2 == 100) {
                isWin = true;
                return "Player 2 Wins!";
            }
            else if (player2 > 100) {
                int goBack = player2 - 100;
                player2 = 100 - goBack;
            }
            if (fields[player2] != 0) player2 = fields[player2];
        }

        if (!sameValueOnDie) {
            player1ture = !player1ture;
            return player1ture ? "Player 2 is on square " + player2 : "Player 1 is on square " + player1;
        } else {

            return !player1ture ? "Player 2 is on square " + player2 : "Player 1 is on square " + player1;
        }
    }

    public static void main(String[] args) {
        SnakesLadders game = new SnakesLadders();
        /*System.out.println(game.play(5, 3));
        System.out.println(game.play(6, 6));
        System.out.println(game.play(6, 6));
        System.out.println(game.play(4, 1));
        System.out.println(game.play(4, 6));
        System.out.println(game.play(4, 4));
        System.out.println(game.play(6, 5));
        System.out.println(game.play(5, 4));
        System.out.println(game.play(2, 2));
        System.out.println(game.play(4, 5));
        System.out.println(game.play(1, 2));
        System.out.println(game.play(2, 1));
        System.out.println(game.play(2, 4));
        System.out.println(game.play(5, 6));
        System.out.println(game.play(4, 2));
        System.out.println(game.play(5, 2));
        System.out.println(game.play(6, 2));
        System.out.println(game.play(4, 3));*/

        System.out.println(game.play( 03, 2));
        System.out.println(game.play( 06, 1));
        System.out.println(game.play( 01, 4));
        System.out.println(game.play( 05, 6));
        System.out.println(game.play( 04, 4));
        System.out.println(game.play( 04, 1));
        System.out.println(game.play( 06, 6));
        System.out.println(game.play( 04, 6));
        System.out.println(game.play( 03, 1));
        System.out.println(game.play( 06, 5));
        System.out.println(game.play( 01, 2));
        System.out.println(game.play(01, 2));
        System.out.println(game.play( 01, 6));
        System.out.println(game.play(01, 2));
        System.out.println(game.play(01, 5));
        System.out.println(game.play(01, 5));
        System.out.println(game.play(03, 1));
        System.out.println(game.play( 03, 2));
        System.out.println(game.play( 04, 1));
        System.out.println(game.play( 05, 4)); //Player 2 Wins!
                //Game over!
        System.out.println(game.play(4, 1));
    }
}
