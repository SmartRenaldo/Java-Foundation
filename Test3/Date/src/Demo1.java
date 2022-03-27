import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        Date d = new Date();
        System.out.println(d);
        long time = d.getTime();
        System.out.println(time);
    }
}
