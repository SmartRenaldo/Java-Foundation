package Method2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintOdds {
    public static void main(String[] args) {
        int num1;
        int num2;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);             //以再次载入用户录入的方式停掉死循环, 需要写在try方法块内
                System.out.print("Please enter the first integer: ");
                num1 = sc.nextInt();
                System.out.print("Please enter the second integer: ");
                num2 = sc.nextInt();
                break;
            } catch (IntegerInputException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
        print_odds_between_two_numbers(num1, num2);
    }

    public static void print_odds_between_two_numbers(int a, int b) throws IntegerInputException {
        if (a < b) {
            System.out.println("Odds between " + a + " and " + b + " are:");
            for (int i = a; i < b; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        } else {
            throw new IntegerInputException("Num1 should bes smaller than num2! Please enter again");
        }
    }
}
