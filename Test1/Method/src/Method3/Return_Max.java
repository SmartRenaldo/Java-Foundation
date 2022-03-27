package Method3;

import java.util.Scanner;

public class Return_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first integer: ");
        int a = sc.nextInt();
        System.out.println("Please enter the second integer: ");
        int b = sc.nextInt();
        System.out.println(getMax(a, b));      //output call
        int max = getMax(a, b);
        for (int i = 0; i < max; i++) {
            System.out.println("Hello World!");
        }
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
