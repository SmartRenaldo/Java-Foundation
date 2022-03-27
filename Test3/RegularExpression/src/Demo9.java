import org.junit.jupiter.api.Test;

/**
 * 正则表达式中
 * ‘\1’ 匹配的是 字符 ‘\1’ 。 (因为 ‘\’ 匹配字符 ‘\’ )
 * ‘\2’ 匹配的是 字符 ‘\2’
 *
 * 单独斜杠的 \1 ， \2 就是反向引用了。
 * ‘\1’ 匹配的是 所获取的第1个()匹配的引用。例如，’(\d)\1’ 匹配两个连续数字字符。如33aa 中的33
 * ‘\2’ 匹配的是 所获取的第2个()匹配的引用。
 * 例如，’(\d)(a)\1’ 匹配第一是数字第二是字符a,第三\1必须匹配第一个一样的数字重复一次，也就是被引用一次。
 * 如9a9 被匹配，但9a8不会被匹配，因为第三位的\1必须是9才可以，
 *
 * ‘(\d)(a)\2’ 匹配第一个是一个数字，第二个是a，第三个\2必须是第二组（）中匹配一样的，
 * 如，8aa被匹配，但8ab，7a7不会被匹配，第三位必须是第二组字符的复制版，也是就引用第二组正则的匹配内容。
 *
 * 以此类推
 */
public class Demo9 {
    @Test
    public void testDuplicate(){
        System.out.println(duplicate("(\\d\\d)\\1", "1212"));
        System.out.println(duplicate("(\\d\\d)\\1", "1234"));
        System.out.println(duplicate("(\\d)(a)\\1", "1a1"));
        System.out.println(duplicate("(\\d)(a)\\1", "1a3"));
        System.out.println(duplicate("(\\d)(a)\\2", "1aa"));
        System.out.println(duplicate("(\\d)(a)\\2", "1a1"));
    }

    private boolean duplicate(String regex, String input) {
        return input.matches(regex);
    }
}
