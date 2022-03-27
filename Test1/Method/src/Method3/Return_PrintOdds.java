package Method3;

import java.util.Scanner;

public class Return_PrintOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first integer: ");
        int a = sc.nextInt();
        System.out.println("Please enter the second integer: ");
        int b = sc.nextInt();
        print_odds_between_two_numbers(a, b);
    }

    public static void print_odds_between_two_numbers(int a, int b) {
        if (a > b) {
            System.out.println("The data you input is incorrect. Please check.");
        }
        System.out.println("Odds between " + a + " and " + b + " are:");
        for (int i = a; i < b; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
