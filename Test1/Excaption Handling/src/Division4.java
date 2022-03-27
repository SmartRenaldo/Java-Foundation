import java.util.InputMismatchException;
import java.util.Scanner;

public class Division4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter dividend: ");
        try {
            int num1 = sc.nextInt();
            System.out.print("Please enter divisor: ");
            int num2 = sc.nextInt();
            System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
            System.out.println("Thanks for your using!");
        } catch (InputMismatchException e) {
            System.out.println("Error! Divisor and dividend should be integers!");
        } catch (ArithmeticException e) {
            System.out.println("Error! Divisor cannot be zero!");
        } catch (Exception e) {
            System.out.println("Error! Illegal operation!");
        } finally {
            System.out.println("Thanks for using!");
        }
    }
}
