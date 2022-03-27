package StudentManagement;

import java.util.Scanner;

public class TestStdMngm {
    public static void main(String[] args) {
        StudentManagement s1 = new StudentManagement();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter the name of student " + (i + 1) +":");
            String name = sc.next();
            s1.addName(name);
        }

        int start;
        int last;
        String name;
        do {
            System.out.println("Initiative value: ");
            start = sc.nextInt();
            System.out.println("End value: ");
            last = sc.nextInt();
            System.out.println("Please enter the name: ");
            name = sc.next();
            if (s1.findName(start, last, name)) {
                System.out.println("Congratulations!");
            } else {
                System.out.println("Sorry! Please enter again!");
            }
        }while(!s1.findName(start, last, name));

        s1.showNames();
    }
}
