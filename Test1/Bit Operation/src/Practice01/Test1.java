package Practice01;

public class Test1 {
    /*
    正整数的补码是其二进制表示，与原码相同
    求负整数的补码，将其原码除符号位外的所有位取反（0变1，1变0，符号位为1不变）后加1
    &: 0, if 0
        6: 00000000 00000000 00000000 00000110
        2: 00000000 00000000 00000000 00000010
    6 & 2: 00000000 00000000 00000000 00000010
     */
    /*
    |: 1, if 1
    ^: Same --> true; Diffi --> false
    ~: 按位非（NOT）（一元运算）；
     */

    public static void main(String[] args) {
        System.out.println(6 & 2);
        System.out.println(~(-7));
    }
}
