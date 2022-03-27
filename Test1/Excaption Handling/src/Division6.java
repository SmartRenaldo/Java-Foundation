import java.util.InputMismatchException;
import java.util.Scanner;

public class Division6 {
    //通过throws声明可能抛出的异常，多个异常用逗号隔开
    public static void division() throws InputMismatchException, ArithmeticException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter dividend: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter divisor: ");
        int num2 = sc.nextInt();
        System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
    }

    public static void main(String[] args) throws InputMismatchException, ArithmeticException {
        //方法2：调用者不处理，继续声明,最终main()声明的异常由JVM处理
        division();
        System.out.println("Thanks for using!");
    }
}
