package Practice;

import java.util.Scanner;

public class Test_Continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter total class size: ");
        int total = scanner.nextInt();
        int score = 0;      //score
        int num = 0;        //number of students with scores >= 80

        for (int i = 1; i <= total; i++) {
            System.out.printf("Please input student %d's grade: ", i);
            score = scanner.nextInt();
            if(score < 80){
                continue;
            }
            num++;
        }
        double percentage = (double) num / total * 100;
        System.out.println("Students with scores higher than or equal to 80 is " + percentage  + "%");
    }
}
