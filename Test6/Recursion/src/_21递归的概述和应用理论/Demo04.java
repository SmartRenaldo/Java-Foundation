package _21递归的概述和应用理论;

/**
 * 目标：递归的经典案例。
 * <p>
 * 猴子吃桃：
 * 猴子第一天摘了若干个桃子，当即吃了一半，觉得好不过瘾，然后又多吃了一个。
 * 第二天又吃了前一天剩下的一半，觉得好不过瘾，然后又多吃了一个。
 * 以后每天都是如此
 * 等到第十天再吃的时候发现只有1个桃子，请问猴子第一天总共摘了多少个桃子。
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println("f(1) = " + f(1));
    }

    public static int f(int i) {
        if (i == 10) return 1;
        else return 2 * f(i + 1) + 2;
    }
}
