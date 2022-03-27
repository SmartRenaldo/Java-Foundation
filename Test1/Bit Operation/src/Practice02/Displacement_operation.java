package Practice02;

public class Displacement_operation {
    public static void main(String[] args) {
        /*
         >>
         右移；
         >>>
         右移，左边空出的位以0填充；无符号右移；
         <<
         左移；
         左移运算符<<使指定值的所有位都左移num位。每左移一个位，高阶位都被移出（并且丢弃），并用0填充右边
         */
        System.out.println(21 << 1);
        System.out.println(21 << 2);
        System.out.println(21 << 3);
        System.out.println("------------------------------");
        System.out.println(6 >> 1);
        System.out.println(6 >> 2);
        //The sign moves to the right, and the sign bit is used to fill the position
        System.out.println(-9 >> 1);
        System.out.println(-9 >>> 1);
        //a ^ b ^ b = a
        //a ^ b ^ a = b
        System.out.println(18 ^ 7 ^ 7);
        System.out.println(18 ^ 7 ^ 18);
    }
}
