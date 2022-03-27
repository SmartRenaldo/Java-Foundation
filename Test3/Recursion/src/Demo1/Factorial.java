package Demo1;

public class Factorial {
    public static int factorial(int n) {
        System.out.println("--------------------");
        System.out.printf("Calling method with n = %d\n", n);
        if (n == 0) {
            System.out.println("Reached base");
            return 1;
        } else {
            System.out.println("Going deeper...");
            int n1Fact = factorial(n - 1);
            int res = n * n1Fact;
            System.out.println("--------------------");
            System.out.printf("Found %d! = %d\n", n - 1, n1Fact);
            System.out.printf("Return %d! = %d * %d = %d\n",n,n1Fact,n,res);
            return res;
        }
    }
}
