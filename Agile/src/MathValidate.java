public class MathValidate {
    public static boolean mathValidate(String equation) {
        String[] args = equation.split(" ");


        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        int res = Integer.parseInt(args[4]);

        return switch (args[1]) {
            case "+" -> (num1 + num2) == res;
            case "-" -> (num1 - num2) == res;
            case "*" -> (num1 * num2) == res;
            case "/" -> (num1 / num2) == res;
            default -> false;
        };


    }
}
