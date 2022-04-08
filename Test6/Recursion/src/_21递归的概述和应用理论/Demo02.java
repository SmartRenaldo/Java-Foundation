package _21递归的概述和应用理论;

/**
 * 目标：递归的核心算法思想和执行流程（重点。拓展）
 * <p>
 * 已知：f(x) = f(x - 1) + 1  （恒等式）
 * 已知：f(1) = 1
 * 求：  f(10) = ?
 * <p>
 * 计算流程：
 * f(10) = f(9) +  1
 * f(9)  = f(8) +  1
 * f(8)  = f(7) +  1
 * f(7)  = f(6) +  1
 * f(6)  = f(5) +  1
 * f(5)  = f(4) +  1
 * f(4)  = f(3) +  1
 * f(3)  = f(2) +  1
 * f(2)  = f(1) +  1
 * f(1)  = 1
 * <p>
 * 递归的三要素（理论）：
 * 1.递归的终结点： f(1)  = 1
 * 2.递归的公式：f(x) = f(x - 1) + 1
 * 3.递归的方向：必须走向终结点
 */
public class Demo02 {
    public static void main(String[] args) {
        try {
            System.out.println(f(0));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(f(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int f(int i) {
        if (i == 1) return 1;
        else if (i > 1) return f(i - 1) + 1;
        else throw new ArithmeticException("The integer should be greater than or equal to 1!");
    }
}
