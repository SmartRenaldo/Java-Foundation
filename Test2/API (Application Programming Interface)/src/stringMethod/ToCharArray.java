package stringMethod;

import java.util.Scanner;

public class ToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }
}
