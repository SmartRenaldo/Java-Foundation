package String;

public class Demo2 {
    public static void main(String[] args) {
        //String(): 初始化一个新创建的 String 对象，使其表示一个空字符序列
        String s1 = new String();
        //打印String的对象名的时候，不会出现内存地址，而会出现该对象所记录的内容
        System.out.println(s1);
        //String(char[] chs): 分配一个新的 String，使其表示字符数组参数中当前包含的字符序列
        char[] chs = {'a', 'b', 'c'};
        System.out.println(chs);
        String s2 = new String(chs);
        System.out.println(s2);
        //String(String original)初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本
        String s3 = new String("123");
        System.out.println(s3);
    }
}
