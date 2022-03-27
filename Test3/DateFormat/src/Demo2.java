import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {
        // 需求：122s后的时间，并且需要格式化输出。
        // 1.得到当前系统此刻时间毫秒值
        long curTime = System.currentTimeMillis();
        // 2.让当前时间往后走122s
        long tarTime = curTime + 122 * 1000;

        // 3.格式化输出
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss EEE a");
        String format = sdf.format(tarTime);
        System.out.println(format);
    }
}
