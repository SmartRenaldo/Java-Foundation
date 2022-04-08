package homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用线程池：一个线程计算10! ，一个线程计算5!， 一个线程计算8!
 * 打印在那个线程执行的和执行结果.(使用Runnable)
 */
public class Test04 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        pool.submit(new Factorial(10));
        pool.submit(new Factorial(5));
        pool.submit(new Factorial(8));
        pool.submit(new Factorial(-5));

    }
}

class Factorial implements Runnable {
    private int num;

    public Factorial(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        try {
            System.out.println("fac(this.num) = " + fac(this.num));
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