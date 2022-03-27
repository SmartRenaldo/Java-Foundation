import java.util.Date;

public class Demo3 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis() + 121 * 1000;
        System.out.println(new Date(time));
    }
}
