package stringMethod;

import java.util.Scanner;

public class UCL_LCL_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string:");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int upperCaseLetter = 0;
        int lowerCaseLetter = 0;
        int number = 0;
        for (char aChar : chars) {
            if (aChar >= '0' && aChar <= '9') {
                number++;
            } else if (aChar >= 'A' && aChar <= 'Z') {
                upperCaseLetter++;
            } else if (aChar >= 'a' && aChar <= 'z') {
                lowerCaseLetter++;
            }
        }










/*        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                number++;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                upperCaseLetter++;
            }
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                lowerCaseLetter++;
            }
        }*/
        System.out.println("Upper Case Letter = " + upperCaseLetter);
        System.out.println("Lower Case Letter = " + lowerCaseLetter);
        System.out.println("Number = " + number);
    }
}
