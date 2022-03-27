package String;

public class Demo4 {
    public static void main(String[] args) {
        //Java 语言提供对字符串串联符号（"+"）以及将其他对象转换为字符串的特殊支持。
        //字符串串联是通过 StringBuilder（或 StringBuffer）类及其 append 方法实现的。
        //字符串转换是通过 toString 方法实现的，该方法由 Object 类定义，并可被 Java 中的所有类继承。
        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2 + "c";
        System.out.println(s1 == s3);
    }
}
