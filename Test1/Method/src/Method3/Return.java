package Method3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter the first integer:");
                a = sc.nextInt();
                System.out.println("Please enter the second integer:");
                b = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("You should enter integers! Please enter again");
            }
        }
        int sum = add(a, b);
        System.out.println("sum = " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
