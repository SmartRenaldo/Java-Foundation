import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) throws ParseException {
        // 需求：面试题
        // 随便给你一个时间“2018-10-12 10:59:59” 请问 1天 2小时 121s后是什么时间
        // 思路：
        // 1.定义字符串时间
        String dateStr = "2018-10-12 10:59:59";

        // 2.把字符串时间解析成日期对象（重点）
        // 重点注意：简单日期格式化的时间格式必须与被解析的时间格式完全一致，否则解析会报错！！
        // 解析字符串时间成日期对象。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateDt = sdf.parse(dateStr);

        // 3.把日期对象转换成时间毫秒值，然后往后走1天 2小时 121s
        long time = dateDt.getTime() + (24 * 60 * 60L + 2 * 60 * 60 + 121) * 1000;

        // 4.格式化计算出的时间毫秒值输出即可。
        System.out.println(sdf.format(time));
    }
}
