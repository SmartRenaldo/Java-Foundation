import java.util.concurrent.locks.Condition;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    /*
        目标：正则表达式
        正则表达式的作用:

        正则表达式是一些特殊的格式化字符，可以用于做信息校验。
        可以用于校验邮箱，手机号码，电话等信息是否合法，是否满足规范。
        可以用于做网络爬虫，可以从一大推的信息中爬出我们想要的数据。

        需求：分别演示不用正则表达式和使用正则表达式校验qq号
        */
    public static void main(String[] args) {
        boolean b = checkQQ("11456755");
        System.out.println(b);
        boolean bb = checkQQ("11435s56755");
        System.out.println(bb);
    }

    //用正则表达式(写法一)
    private static boolean checkQQRegex(String qq) {
        return qq != null && qq.matches("\\d{4,}");
    }

    /*
    在使用正则表达式时，利用好其预编译功能，可以有效加快正则匹配速度。 说明：不要在方法体内定义：Pattern pattern = Pattern.compile(规则);
    public class XxxClass {
        // Use precompile
        private static Pattern NUMBER_PATTERN = Pattern.compile("[0-9]+");
        public Pattern getNumberPattern() {
            // Avoid use Pattern.compile in method body.
            Pattern localPattern = Pattern.compile("[0-9]+");
            return localPattern;
        }
    }*/

    //用正则表达式(写法二)
    private static boolean checkQQRegex2(String qq) {
        Pattern pattern = Pattern.compile("\\d{4,}");
        Matcher matcher = pattern.matcher(qq);
        return qq != null && qq.matches("\\d{4,}");
    }

    //(写法二简化写法)
    private static boolean booleancheckQQRegex3(String qq){
        return Pattern.matches("\\d{4,}",qq);
    }

    //不用正则表达式
    private static boolean checkQQ(String qq) {
        if (qq == null) {
            return false;
        } else {
            if (qq.length() < 4) {
                return false;
            } else {
                boolean flag = true;
                for (int i = 0; i < qq.length(); i++) {
                    //Condition 'qq.charAt(i)<0' is always 'false'
                    if (qq.charAt(i) > '9') {
                        flag = false;
                        break;
                    }
                }
                return flag;
            }
        }
    }
}
