public class Demo2 {
/*
    目标：深入学习正则表达式的写法。
    字符类
     [abc] a、b 或 c（简单类）
            [^abc] 任何字符，除了 a、b 或 c（否定）
            [a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围）
            [a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集）
            [a-z&&[def23]] d、e 或 f（交集）
            [a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去）
            [a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去）

    预定义字符类
            . 任何字符
     \d 数字：[0-9]
            \D 非数字： [^0-9]
            \s 空白字符：[ \t\n\x0B\f\r]
            \S 非空白字符：[^\s]
            \w 下划线, 单词和数字字符：[a-z A-Z _ 0-9]
            \W 非下划线, 单词和数字字符：[^\w]

    以上正则匹配只能校验单个字符。

    Greedy 数量词
    X? X，一次或一次也没有
    X* X，零次,一次或多次
    X+ X，一次或多次X* X
    X{n} X，恰好 n 次
    X{n,} X，至少 n 次
    X{n,m} X，至少 n 次，但是不超过 m 次
*/
    public static void main(String[] args) {
        //public boolean matches(String regex):判断是否与正则表达式匹配，匹配返回true
        // 只能是 a b c
        System.out.println("a".matches("[abc]"));       //true
        System.out.println("z".matches("[abc]"));       //false

        // 不能出现a  b  c
        System.out.println("a".matches("[^abc]"));      //false
        System.out.println("z".matches("[^abc]"));      //true

        // \w 下划线, 单词和数字字符：[a-zA-Z_0-9]
        System.out.println("a".matches("\\w"));         //true
        System.out.println("1".matches("\\w"));         //true
        System.out.println("P".matches("\\w"));         //true
        System.out.println("P".matches("\\w*"));         //true

        // \d 数字：[0-9]
        System.out.println("5".matches("\\d"));         //true
        System.out.println("22".matches("\\d"));        //false

        // \W 非下划线, 单词和数字字符：[^\w]
        System.out.println("_".matches("\\W"));         //false
        //  以上正则匹配只能校验单个字符。

        // 校验密码
        // 有且仅有数字 字母 下划线 至少 6位
        System.out.println("13s_913".matches("\\w{6,}"));       //true
        System.out.println("412va".matches("\\w{6,}"));         //false

        // 验证。必须是数字和字母  必须是4位
        System.out.println("89Wt".matches("[a-zA-Z0-9]{4}"));   //true
        System.out.println("931C".matches("[0-9a-zA-Z]{4}"));   //true
    }
}
