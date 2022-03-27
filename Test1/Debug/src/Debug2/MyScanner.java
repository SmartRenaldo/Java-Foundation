package Debug2;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
