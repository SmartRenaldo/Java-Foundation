package ReversePolishNotation;

public class Main {
    public static void main(String[] args) {
        String expression = "1+((2+3)*4)-5";
        System.out.println(ReversePolishNotation.calculate(expression));
        String str = "2*3-5+9/3";       //4
        System.out.println(ReversePolishNotation.calculate(str));
        String str2 = "33*7-(8+5)*4/2";     //205
        System.out.println(ReversePolishNotation.calculate(str2));
    }
}
