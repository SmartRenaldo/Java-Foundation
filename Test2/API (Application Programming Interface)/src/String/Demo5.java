package String;

public class Demo5 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "a" + "b" + "c";
        //Java存在常量优化机制，在编译的时候，就会将"a" + "b" + "c"拼接为"abc"
        System.out.println(s1 == s2);
    }
}
