package Practice;

import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;    //total score
        boolean flag = true;    //handle exceptions
        double avg;     //average score
        System.out.print("Please enter the student's name: ");
        String name = scanner.next();
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Please enter the score of course %d: ", i);
            double score = scanner.nextDouble();
            if (score < 0 || score > 100) {
                flag = false;
                break;
            }
            sum+=score;
        }
        if (flag) {
            avg = sum / 5;
            System.out.println("The average score is: " + avg);
        }else{
            System.out.println("Entry error!");
        }
    }
}
