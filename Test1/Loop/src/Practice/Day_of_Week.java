package Practice;

import java.util.Scanner;

public class Day_of_Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.print("Please enter an integer range from 1 to 7: ");
            num = sc.nextInt();
            if (num < 0 || num > 7){
                System.out.println("Sorry, the integer your entered is wrong! Please enter again!");
                System.out.println();
                continue;
            }
                switch (num) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuseday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }
        } while (num != 0);
        System.out.println("Thanks for your using! Have a good day!");
    }
}
