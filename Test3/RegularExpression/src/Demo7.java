import org.junit.jupiter.api.Test;

/**
 * 小数点符号'.'代表任意单个字符，若要匹配'.'需写成'\\.'
 */
public class Demo7 {
    /**
     * 判断字符串是否匹配 年-月-日 时:分:秒.毫秒 的形式，比如 1999-09-09 21:44:07.100
     */
    @Test
    public void testMatch1() {
        System.out.println(match1("1999-09-09 21:44:07.100"));
    }

    private boolean match1(String time) {
        return time.matches("\\d{4}-\\d{2}-\\d{2}[ ]\\d{2}:\\d{2}:\\d{2}\\.\\d{3}");
    }

    /**
     * 判断一个字符串是否只能由字母，数字和_组成，其长度只能为6-15位
     */
    @Test
    public void testMatch2() {
        System.out.println(match2("111__rweg"));
    }

    private boolean match2(String s) {
        return s.matches("\\w{6,15}");
    }

    /**
     * 验证一个字符串是否是小数
     */
    @Test
    public void testMatch3(){
        System.out.println(match3("11.7"));
    }

    private boolean match3(String decimal) {
        return decimal.matches("-?\\d+\\.\\d+");
    }
}
