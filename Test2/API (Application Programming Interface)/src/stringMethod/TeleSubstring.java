package stringMethod;

import java.util.Scanner;

public class TeleSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your telephone number:");
        String s = sc.nextLine();
        String start = s.substring(0, 3);
        String end = s.substring(7);
        System.out.println(start + "****" + end);
    }
}
