import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ^: 匹配一行字符串的开头
 * $: 匹配一行字符串的结尾
 * \\b: 匹配一个单词的边界
 * \\B: 匹配一个非单词的边界
 */
public class Demo11 {
    /**
     * 测试^, $
     */
    @Test
    public void test(){
        //匹配固定电话  4位区号-7位号码 或者 3位区号-8位号码
        String regex2="^\\d{4}-\\d{7}|\\d{3}-\\d{8}$";
        String str2="020-13222113";
        String str3="0532-9989211";
        System.out.println(str2.matches(regex2));
        System.out.println(str3.matches(regex2));

        String a = "3131sasfasd".replaceAll("\\d{2}", "Z");
        String b = "3131sasfasd".replaceAll("^\\d{2}", "Z");//仅替换字符串开头的两个数字
        String c = "3131sdasfasd".replaceAll("sd", "Z");
        String d = "3131sdasfasd".replaceAll("sd$", "Z");//仅替换字符串结尾的两个字母
        System.out.println(a);//ZZsasfasd
        System.out.println(b);//Z31sasfasd
        System.out.println(c);//3131ZasfaZ
        System.out.println(d);//3131sdasfaZ
    }

    /**
     * 测试\\b, \\B
     */
    @Test
    public void test2(){
        macth2("\\bdog\\b", "The dog plays in the yard");
        macth2("\\bdog\\B", "The dog plays in the yard");
        macth2("\\bdog\\b", "The doggie plays in the yard.");
        macth2("\\bdog\\B", "The doggie plays in the yard.");
    }

    private void macth2(String regex, String input) {
        System.out.println("--------" + regex + "--------");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean flag = false;

        while (matcher.find()) {
            System.out.println("找到的子字符串是: " + matcher.group() +
                    ", 开始的下标是: " + matcher.start() +
                    ", 结束的下标是: " + matcher.end());
            flag = true;
        }

        if (!flag){
            System.out.println("无法成功匹配!");
        }
    }

    @Test
    public void test3(){
        String regex = "\\w[\\w\\.]*@[\\w\\.]*\\.(com|cn|net)";
        System.out.println("167.879gx_0@qq.com".matches(regex));
        String regex2 = "\\w[A-Za-z_0-9\\.]*@[A-Za-z_0-9\\.]*\\.(com|cn|net)";
        System.out.println("167.879gx_0@qq.com".matches(regex2));
    }
}
