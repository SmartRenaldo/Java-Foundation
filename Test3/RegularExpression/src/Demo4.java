import java.util.Arrays;

public class Demo4 {
/*
    String的split()的两种方法

    public String[] split(String regex)
    该方法就是给定的表达式和限制参数0来调用两参数split方法。

    public String[] split(String regex,int limit)
    规定：使用regex进行字符串切割称为模式匹配

    参数regex：
            1.如果表达式不匹配输入的任何内容，返回的数组只具有一个元素，即此字符串。（尤其注意空字符串这种情况，他也是一个字符串）
            2.可以匹配的情况下，每一个字符串都由另一个匹配给定表达式的子字符串终止，或者由此字符串末尾终止（数组中的字符串按照他们在此字符串出现的顺序排列）

    参数：limit：
    该参数用于控制模式匹配使用的次数，可以影响到数组的长度
            1.limit>0:
    模式匹配将被最多应用n-1次，数组的长度将不会大于n，数组的最后一项将包含所有超出最后匹配的定界符的输入。
            2.limit<0:
    模式匹配将应用尽可能多的次数，而且数组的长度是任何长度。
            3.lilmit=0:
    模式匹配将被应用尽可能多的次数，数组可以是任何长度，并且结尾空字符串将被丢弃。

    对 “boo:and:foo”进行分割(注意空字符串的使用)

    regex limit result
    : 2 {“boo”,”and:foo”}
    : 5 {“boo”,”and”,”foo”}
    : -2 {“boo”,”and”,”foo”}
    o 5 {“b”,”“,”:and:f”,”“,”“}
    o -2 {“b”,”“,”:and:f”,”“,”“}
    o 0 {“b”,”“,”:and:f”}
    */
    public static void main(String[] args) {
        //1.split()的基础方法
        String names = "Catherine,Tiffany,Robin";
        String[] arrNames = names.split(",");
        System.out.println(Arrays.toString(arrNames));

        //2.split()结合正则表达式做分割
        System.out.println("---------------------------");
        String names2 = "Catherine7823924524Tiffany834Robin";
        String[] arrNames2 = names2.split("\\d+");
        System.out.println(Arrays.toString(arrNames2));

        //3.使用正则表达式定位出内容，替换成/
        System.out.println("---------------------------");
        String names3 = "Catherine7823924524Tiffany834Robin";
        System.out.println(names3.replaceAll("\\d+", "/"));

        //replace '.' with '\'
        System.out.println("---------------------------");
        String names4 = "Catherine-Tiffany-Robin";
        System.out.println(names4.replaceAll("\\.", "\\\\"));

        //replace any char with '\'
        System.out.println("---------------------------");
        String names5 = "Catherine-Tiffany-Robin";
        System.out.println(names4.replaceAll(".", "\\\\"));

        System.out.println("\\");
    }
}
