package homework07;

/**
 * 9.1． 训练知识点
 * 1.递归的使用
 * 9.2． 训练描述
 * 求1到n的和(n>=100 &&n<=200)
 * 9.3． 操作步骤描述
 * 1. 定义一个求和方法sum,接收一个整形参数num
 * 2. 明确递归终止的条件
 * 3. 分析递归逻辑：1到n的和等于1到(n-1)的和再加n
 * 4. 开始递归
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println("sum(150) = " + sum(150));
        System.out.println("sum(-50) = " + sum(-50));
    }

    private static int sum(int n) {
        if (n == 0) return 0;
        if (n > 0) return sum(n - 1) + n;
        throw new RuntimeException("The integer should equals to or be greater than 0");
    }
}
