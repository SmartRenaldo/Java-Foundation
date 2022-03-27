import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        // 1.得到一个当前系统此刻时间对应的日历对象。
        Calendar rightNow = Calendar.getInstance();
        System.out.println("rightNow = " + rightNow);
        System.out.println();

        // 2.获取年
        int year = rightNow.get(Calendar.YEAR);
        System.out.println("year = " + year);

        // 获取月
        int month = rightNow.get(Calendar.MONTH) + 1;
        System.out.println("month = " + month);

        // 一年中的第几天
        System.out.println("rightNow.get(Calendar.DAY_OF_YEAR) = " + rightNow.get(Calendar.DAY_OF_YEAR));

        // 3.获取日期对象
        Date rightNowTime = rightNow.getTime();
        System.out.println("rightNowTime = " + rightNowTime);

        // 4.直接获取此刻时间毫秒值
        System.out.println("rightNow.getTimeInMillis() = " + rightNow.getTimeInMillis());

        // 5.问300天后是什么时间：添加
        // 直接让日历在一年中的第几天往后走300天。
        rightNow.add(Calendar.DAY_OF_YEAR,300);
        System.out.println("rightNow.getTime() = " + rightNow.getTime());
        Date time = rightNow.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("sdf.format(time) = " + sdf.format(time));

        // 6.把日历的年份改成1996:修改
        rightNow.set(Calendar.YEAR,1996);
        System.out.println("rightNow.getTime() = " + rightNow.getTime());
    }
}
