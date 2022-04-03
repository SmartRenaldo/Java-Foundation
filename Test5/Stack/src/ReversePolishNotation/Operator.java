package ReversePolishNotation;

public class Operator {
    private final static int ADD = 1;
    private final static int SUB = 1;
    private final static int MUL = 2;
    private final static int DIV = 2;

    public static int getValue(String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = ADD;
                break;
            case "-":
                result = SUB;
                break;
            case "*":
                result = MUL;
                break;
            case "/":
                result = DIV;
                break;
            case "(",")":
                break;
            default:
                System.out.println("Wrong operator!");
                break;
        }
        return result;
    }
}
