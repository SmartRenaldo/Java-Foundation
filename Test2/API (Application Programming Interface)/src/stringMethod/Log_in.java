package stringMethod;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Log_in {
    static {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "admin";
        String password = "123456";

        for (int i = 1; i <= 3; i++) {
            System.out.println("Please input your username:");
            String sUsername = sc.nextLine();
            System.out.println("Please input your password:");
            String sPassword = sc.nextLine();
            if (sUsername.equals(username) && sPassword.equals(password)) {
                System.out.println("Logged in");
                break;
            }
            if (i == 1) {
                System.out.println("Login failed! 2 chances left!");
            } else if (i == 2) {
                System.out.println("Login failed! 1 chance left!");
            } else if (i == 3) {
                System.out.println("Login failed! Please log in tomorrow!");
            }
        }
    }
}
