package Debug1;

public class Test2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                //  i += sum;
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
