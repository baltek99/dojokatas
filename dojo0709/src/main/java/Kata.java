public class Kata {
    public static char triangle(final String row) {
        // G+G=G
        // B+G=R
        // R+G=B
        // B+R=G
        if (row.length() == 1)
            return row.charAt(0);

        StringBuilder sb = new StringBuilder();
        String previousRow = row;

        while (sb.toString().length() != 1) {
            sb.setLength(0);
            for (int i = 1; i < previousRow.length(); i++) {
                if (previousRow.charAt(i - 1) == previousRow.charAt(i)) {
                    sb.append(previousRow.charAt(i));
                } else if ((previousRow.charAt(i - 1) == 'B'
                        || previousRow.charAt(i - 1) == 'G')
                        && (previousRow.charAt(i) == 'B'
                        || previousRow.charAt(i) == 'G')) {
                    sb.append('R');
                } else if ((previousRow.charAt(i - 1) == 'R'
                        || previousRow.charAt(i - 1) == 'G')
                        && (previousRow.charAt(i) == 'R'
                        || previousRow.charAt(i) == 'G')) {
                    sb.append('B');
                } else
                    sb.append('G');
            }
            previousRow = sb.toString();
        }

        return sb.toString().charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(triangle("B"));
        System.out.println(triangle("RBRGBRB"));
        System.out.println(triangle("RGBG"));
        System.out.println(triangle("RRR"));
        System.out.println(triangle("GB"));
        System.out.println(triangle("RBRGBRBGGRRRBGBBBGG"));
        System.out.println(triangle("RRGBRGBB"));
    }

}