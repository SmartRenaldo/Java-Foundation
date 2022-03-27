package Scanner;

import java.util.Scanner;

public class Next_or_NextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number:");
        int num = sc.nextInt();
        /*
        When nextInt and nextLine are used together, nextLine cannot receive data.
        System.out.println("Please input a String:");
        String s = sc.nextLine();
        */
        System.out.println("Please input a string:");
        String s = sc.next();
        System.out.println(num);
        System.out.println(s);
    }
}
