package TreeSet;

public class TestCompareTo {
    public static void main(String[] args) {
        // 前面和后面每个字符完全一样，返回 0
        String str1 = "ABC";
        String str2 = "ABC";
        System.out.println(str1.compareTo(str2));

        // 前面每个字符完全一样，返回：后面就是字符串长度差
        String str3 = "111";
        String str4 = "11111";
        String str5 = "1111111";
        System.out.println(str3.compareTo(str4));       // -2 (前面相等,str3 长度小 2)
        System.out.println(str3.compareTo(str5));       // -4 (前面相等,str3 长度小 4)



        // 前面每个字符不完全一样，返回：出现不一样的字符 ASCII 差
        String foo1 = "ABC";
        String foo2 = "ABD";
        System.out.println(foo1.compareTo(foo2));
        // -1  (foo1 的 'C' 字符 ASCII 码值为 67，foo2 的 'D' 字符 ASCII 码值为 68。返回 67 - 68 = -1)

        String foo3 = "aBC";
        System.out.println(foo1.compareTo(foo3));
        // -32 (foo1 的 'A' 字符 ASCII 码值为 65，foo3 的 'a' 字符 ASCII 码值为 97。返回 65 - 97 = -32)

        String chnChar1 = "泥";
        String chnChar2 = "瓦";
        System.out.println(chnChar1.compareTo(chnChar2));
        // -2049 （泥 和 瓦的 Unicode 差值）

/*
        Unicode（ 统一码、万国码、单一码）是计算机科学领域里的一项业界标准,包括字符集、编码方案等。
        Unicode 是为了解决传统的字符编码方案的局限而产生的，它为每种语言中的每个字符设定了统一并且唯一的 二进制编码，
        以满足跨语言、跨平台进行文本转换、处理的要求。1990年开始研发，1994年正式公布。
        */
    }
}
