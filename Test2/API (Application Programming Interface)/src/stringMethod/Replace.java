package stringMethod;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a sentence:");
        String s = sc.nextLine();
        String purify = s.replace("TMD", "***");
        System.out.println(s);
        System.out.println(purify);
    }
}
