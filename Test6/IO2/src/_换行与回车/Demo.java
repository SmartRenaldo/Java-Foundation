package _换行与回车;

/**
 * '\r' 回车，读到当前行的行首，而不会换到下一行，如果接着输出的话，本行以前的内容会被逐一覆盖；
 * '\n' 换行，换到当前位置的下一行，而不会回到行首；
 * '\b' 删除前一个字符
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("汉字\n汉字");
        System.out.println();
        System.out.println("汉字\r数字");
        System.out.println();
        System.out.println("汉字\r\n汉字");
        System.out.println("aaa\b");
        System.out.println("aaa\bs");
        System.out.println("汉\b汉字");
    }
}
