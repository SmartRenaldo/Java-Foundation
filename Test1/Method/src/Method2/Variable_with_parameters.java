package Method2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Variable_with_parameters {
    public static void main(String[] args) {
        int num;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter an integer: ");
                num = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("You should input an integer! Please input again!");
            }
        }
        odd_or_even(num);
    }
    public static void odd_or_even(int num){
        if(num %2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
