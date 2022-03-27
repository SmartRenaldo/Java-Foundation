import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        // 需求：把此刻日期对象格式化成我们喜欢的形式。
        // 1.得到此刻日期对象
        Date d = new Date();
        System.out.println(d);

        // 2.创建一个简单日期格式化对象负责格式化日期对象
        // 注意：参数是时间的格式。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss EEE a");
        // 3.开始调用方法格式化时间得到格式化的字符串时间形式
        String s = sdf.format(d);
        System.out.println(s);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String s2 = sdf2.format(d);
        System.out.println(s2);
    }
}
