package homework;

/**
 * 开启三个线程，分别执行以下三个运算，并将运算结果输出到控制台。
 * <p>
 * - 一个线程计算10!
 * - 一个线程计算5!
 * - 一个线程计算8!
 */
public class Test5 {
    public static void main(String[] args) {
        new Factorial(10).start();
        new Factorial(5).start();
        new Factorial(8).start();
    }
}

class Factorial extends Thread {
    private int num;

    public Factorial(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        try {
            System.out.println("fac(" + this.num + ") = " + fac(this.num));
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