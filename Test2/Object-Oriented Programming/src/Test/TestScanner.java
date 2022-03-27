package Test;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student std = new Student();
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        String ageStr = "";
        int age = 0;
        while (true) {
            System.out.println("Please enter your age:");
            ageStr = sc.next();
            if (ageStr.matches("\\d+")){
                age = Integer.parseInt(ageStr);
                break;
            }
        }
        sc.nextLine();
        System.out.println("Please enter your favorite book:");
        String favBook = sc.nextLine();
        System.out.println();
        std.show(name, age, favBook);
    }
}
