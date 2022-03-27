package String;

public class Demo3 {
    public static void main(String[] args) {
        /*
        ==作比较:
        基本数据类型:比较具体值;
        引用数据类型:比较地址值

        字符串常量池：当使用双引号创建对象的时候，系统会检查该字符串是否在常量池中存在。
        不存在：创建
        存在：直接复用
        */
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        //通过new创建的字符串对象，每一次new都会申请一个新的内存空间，即使内容相同，地址值也不同
        char[] chs = {'a', 'b', 'c'};
        String s3 = new String(chs);
        String s4 = new String(chs);
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));      //String类重写了equals方法
    }
}
