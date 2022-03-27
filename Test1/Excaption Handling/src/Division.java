import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter dividend: ");
        int num1 = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                num1 = scanner.nextInt();
                break;
            }
            System.out.print("You should enter an integer. Please enter dividend again: ");
            scanner = new Scanner(System.in);
        }

        System.out.print("Please enter divisor: ");
        lo:
        while (true) {
            if(scanner.hasNextInt()){
                int num2 = scanner.nextInt();
                while (true) {
                    if(num2 == 0){
                        System.out.print("Divisor cannot be zero! Please enter divisor again: ");
                        num2 = scanner.nextInt();
                    }else{
                        System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
                        System.out.println("Thanks for your using!");
                        break lo;
                    }
                }
            }else{
                System.out.print("Divisor is not an integer! Please enter divisor again: ");
                scanner = new Scanner(System.in);
            }
        }
/*        if(scanner.hasNextInt()){
            int num2 = scanner.nextInt();
            if(num2 == 0){
                System.out.println("Divisor cannot be zero!");
                System.exit(1);
            }else{
                System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
                System.out.println("Thanks for your using!");
            }
        }else{
            System.out.println("Divisor is not an integer!");
            System.exit(1);
        }*/
    }
}