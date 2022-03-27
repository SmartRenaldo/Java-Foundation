import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo5 {
    public static void main(String[] args) {
        String rs = "来黑马程序学习Java,电话020-43422424，或者联系邮箱" +
                "itcast@itcast.cn,电话18762832633，0203232323" +
                "邮箱bozai@itcast.cn，400-100-3233 ，4001003232";
        // 需求：从上面的内容中爬取出 电话号码和邮箱。
        // 1.定义爬取规则
        String regex = "(0\\d{2,3}-?\\d{7,8})|([0-9A-Za-z]+@[0-9A-Za-z]{2,}\\.c[om|n])|" +
                "(1[3-9]\\d{9})|(400-?\\d{3,7}-?\\d{3,7})";
        // 2.编译正则表达式成为一个匹配规则对象
        Pattern pattern = Pattern.compile(regex);
        // 3.通过匹配规则对象得到一个匹配数据内容的匹配器对象
        Matcher matcher = pattern.matcher(rs);
        // 4.通过匹配器去内容中爬取出信息
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
