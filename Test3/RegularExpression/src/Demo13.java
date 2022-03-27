import org.junit.jupiter.api.Test;

/**
 * replace()只支持精确匹配
 * replaceAll()支持正则表达式，也支持精确匹配(原理也是正则表达式)
 * replaceFirst()支持正则表达式，也支持精确匹配(原理也是正则表达式)
 *
 * replace()可以传入char和String类型参数, replaceAll()和replaceFirst()只能传入String类型参数
 */
public class Demo13 {
    @Test
    public void test(){
        String input = "aaaaaa1bbb2ccccc3dddd4ee5f6";
        System.out.println(input.replace('a', '_'));
        System.out.println(input.replaceAll("a", "_"));
        System.out.println(input.replaceFirst("a", "_"));
        System.out.println(input.replace("[a-zA-Z]+", "_"));
        System.out.println(input.replaceAll("[a-zA-Z]+", "_"));
        System.out.println(input.replaceFirst("[a-zA-Z]+", "_"));
    }
}
