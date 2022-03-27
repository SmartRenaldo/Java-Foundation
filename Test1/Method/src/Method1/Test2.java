package Method1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if(a % 2 == 0){
                System.out.println(a + " is even.");
            }else{
                System.out.println(a + " is odd.");
            }
        }
    }
}
