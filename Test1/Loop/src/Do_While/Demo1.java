package Do_While;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans;

        do{
            System.out.println("Please judge whether it is correct (Y/N)");
            ans = sc.next();
        }while("N".equals(ans));

        System.out.println("Congratulations! Your answer is correct!");
    }
}
