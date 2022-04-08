package _21递归的概述和应用理论;

/**
 * 拓展：递归的核心思想-公式转换
 * <p>
 * 已知： f(x) = f(x + 1) + 2
 * f(1) = 1
 * 求：   f(10) = ?
 * <p>
 * 公式转换：
 * f(n-1) = f(n-1+1)+2
 * f(n-1) = f(n)+2
 * f(n) = f(n-1)- 2 ;
 * <p>
 * 递归算法的三要素：
 * （1）递归的公式：   f(n) = f(n-1)- 2 ;
 * （2）递归的终结点：  f(1) = 1
 * （3）递归的方向：必须走向终结点。
 * 小结：
 * 必须满足三要素，否则递归会出现死亡！
 */
public class Demo03 {
    public static void main(String[] args) {
        try {
            System.out.println("f(10) = " + f(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int f(int i) {
        if (i == 1) return 1;
        else if (i > 1) return f(i - 1) - 2;
        else throw new ArithmeticException("The integer should be greater than or equal to 1!");
    }
}
