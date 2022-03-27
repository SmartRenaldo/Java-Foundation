import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 贪婪型, 勉强型和占有型
 * <p>
 * Greediness（贪婪型）：最大匹配
 * X?、X*、X+、X{n}、X{n，}、X{n，m} 是最大匹配。
 * 在 Greediness 的模式下，会尽量大范围的匹配，直到匹配了整个内容，
 * 这时发现匹配不能成功时，开始回退缩小匹配范围，直到匹配成功.
 * <p>
 * Reluctant(Laziness)（勉强型）:最小匹配
 * X??、X*?、X+?、X{n}?、X{n，}?、X{n，m}? 是最小匹配。
 * 在 Reluctant 的模式下，只要匹配成功，就不再继续尝试匹配更大范围的内容.
 * <p>
 * Possessive（占有型）：完全匹配
 * X?+、X*+、X++、X{n}+、X{n，}+、X{n，m}+ 是完全匹配
 * Possessive 模式与 Greediness 有一定的相似性，那就是都尽量匹配最大范围的内容，直到内容结束，
 * 但与 Greediness 不同的是，完全匹配不再回退尝试匹配更小的范围。
 *
 * 注：在不考虑匹配需求情况下，占有型匹配性能比贪婪型性能高
 */
public class Demo8 {
    @Test
    public void testQuantifiers() {
        match(".*foo", "rfoorrrrrfoo");
        match(".*?foo", "rfoorrrrrfoo");
        match(".*+foo", "rfoorrrrrfoo");
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

        if (!flag){
            System.out.println("无法成功匹配!");
        }
    }
}
