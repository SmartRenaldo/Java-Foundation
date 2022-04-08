package _21递归的概述和应用理论;

/**
 * 目标：n的阶乘。
 * <p>
 * n!= 1*2*3*4*5*6*...*(n-1)*n。
 * f(n) = 1*2*3*4*5*6*...*(n-1)*n
 * f(n) = f(n-1)*n
 * <p>
 * 流程：
 * f(5) = f(4) * 5 ;  = 1*2*3*4*5
 * f(4) = f(3) * 4 ;  = 1*2*3*4
 * f(3) = f(2) * 3 ;  = 1*2*3
 * f(2) = f(1) * 2 ;  = 1*2
 * f(1) = 1
 * <p>
 * 递归的核心三要素：
 * （1）递归的终点接： f(1) = 1
 * （2）递归的公式   f(n) = f(n-1)*n
 * （3）递归的方向必须走向终结点
 * ---------------------------------------------------------
 * 以上理论只能针对于规律化递归，如果是非规律化是不能套用以上公式的！
 * 非规律化递归的问题：文件搜索，啤酒问题。
 * 非规律化就看你的水平了！自己看着办！！
 * <p>
 * 非规律化递归：啤酒问题：（作业）
 * 啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶
 * ，问10元可以喝多少瓶，剩余多少盖子和瓶子！！  15 3 1
 */
public class Demo05 {
    public static void main(String[] args) {
        try {
            System.out.println("fac(10) = " + fac(10));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("fac(-5) = " + fac(-5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int fac(int i) {
        if (i < 0) throw new ArithmeticException("The integer should be greater than or equal to one");
        if (i == 0) return 1;
        return fac(i - 1) * i;
    }
}
