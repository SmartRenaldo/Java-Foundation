import java.util.Date;

public class Demo2_TestGetTime {
    public static void main(String[] args) {
        //negative example
        //long startTime = new Date().getTime();
        //positive example
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        //negative example
        //long endTime = new Date().getTime();
        //positive example
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.0 + "s");
    }
}
