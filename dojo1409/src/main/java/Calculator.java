import java.util.Stack;

public class Calculator {
    public static Double evaluate(String expression) {
        if (expression.charAt(0) == '-')
            expression = "0 " + expression;
        String[] exp = expression.split(" ");
        String onp = toONP(exp);
        return calculateONP(onp);
    }

    public static Double calculateONP(String expression) {
        Stack<Double> stos = new Stack<>();
        double a, b, w = 0.0;
        String[] exp = expression.split(" ");
        Double result = 0.0;

        for (int i = 0; i < exp.length; i++) {
            if (isNumeric(exp[i])) {
                stos.push(Double.parseDouble(exp[i]));
            } else if (exp[i].equals("=")) {
                break;
            } else {
                a = stos.pop();
                b = stos.pop();

                switch (exp[i]) {
                    case "+":
                        w = b + a;
                        break;
                    case "-":
                        w = b - a;
                        break;
                    case "*":
                        w = b * a;
                        break;
                    case "/":
                        w = b / a;
                        break;
                    case "^":
                        w = Math.pow(a, b);
                        break;
                }
                stos.push(w);
            }
        }
        if (!stos.isEmpty())
            result = stos.pop();

        return result;
    }

    public static String toONP(String[] exp) {
        Stack<String> stos = new Stack<>();
        StringBuilder onp = new StringBuilder();

        for (int i = 0; i < exp.length; i++) {
            String element = exp[i];
            if (isNumeric(element)) {
                onp.append(element).append(" ");
            } else if (element.equals("=")) {
                onp.append(element);
                break;
            } else {
                while (!stos.isEmpty() && hasHigherPriority(stos.peek(), element)) {
                    onp.append(stos.pop()).append(" ");
                }
                stos.push(element);
            }
        }

        while (!stos.isEmpty()) {
            onp.append(stos.pop()).append(" ");
        }

        onp.append("=");

        return onp.toString();
    }

    public static boolean isNumeric(String str) {
        if (str.charAt(0) == '-' && str.length() > 1)
            str = str.substring(1);
        return str.chars().allMatch(Calculator::isNumOrDot);
    }

    public static boolean isNumOrDot(int c) {
        return Character.isDigit(c) || c == '.' || c == 'E';
    }

    public static boolean hasHigherPriority(String s1, String s2) {
        return priority(s1) >= priority(s2);
    }

    public static int priority(String s) {
        switch (s) {
            case "^":
                return 3;
            case "*":
                return 2;
            case "/":
                return 2;
            case "+":
                return 1;
            case "-":
                return 1;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String s = "3 + 2 * 5";

        System.out.println(s);
        String[] exp = s.split(" ");
        System.out.println(toONP(exp));
        System.out.println();
        System.out.println(evaluate(s));
        System.out.println();

        s = "7.7 - 3.3 - 4.4";
        //s = "7.7 + 3.3 + 4.4";
        System.out.println(toONP(s.split(" ")));
        System.out.println();
        System.out.println(evaluate(s));


        s = "7.7 + 3.3 - 4.4 + 10.0 + 5.0";
        s = "20 - 7.7 - 2.3 + 5 - 10 + 1";
        s = "-120.5";
        s = "2.69434098E8";
        System.out.println();
        System.out.println(toONP(s.split(" ")));
        System.out.println();
        System.out.println(evaluate(s));
    }
}
