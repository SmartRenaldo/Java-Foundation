package stringBuilder;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reverse_s = sb.toString();
        if (s.equals(reverse_s)) {
            System.out.println("Symmetric string");
        } else {
            System.out.println("Asymmetric string");
        }
    }
}
