package stringMethod;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "123456789";
        String substring = s.substring(2);
        String substring1 = s.substring(0, 2);
        System.out.println(substring);
        System.out.println(substring1);
    }
}
