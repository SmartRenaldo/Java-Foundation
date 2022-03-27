import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 要求：匹配出"北京市(海淀区)(朝阳区)(西城区)"左括号之前的内容(北京市)
 * (?=\\() 代表匹配出左括号但不显示
 */
public class Demo12 {
    @Test
    public void testMatch() {
        match(".*?", "北京市(海淀区)(朝阳区)(西城区)");
    }

    private void match(String regex, String input) {
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

        if (!flag) {
            System.out.println("无法成功匹配!");
        }
    }
}
