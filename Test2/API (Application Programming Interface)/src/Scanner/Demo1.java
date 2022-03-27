package Scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string: ");
        //ctrl+alt+v: Quickly generate return value
        String s = scanner.nextLine();
        System.out.println(s);
    }
}
