package stringBuilder;

public class Demo3 {
    public static void main(String[] args) {
        /*
        在 StringBuilder 上的主要操作是 append 和 insert 方法，
        可重载这些方法，以接受任意类型的数据。
        每个方法都能有效地将给定的数据转换成字符串，然后将该字符串的字符追加或插入到字符串生成器中。
        append 方法始终将这些字符添加到生成器的末端；而 insert 方法则在指定的点添加字符。
        */

        StringBuilder sB1 = new StringBuilder();
        System.out.println(sB1);

        StringBuilder sB2 = new StringBuilder("abc");
        System.out.println(sB2);
    }
}
