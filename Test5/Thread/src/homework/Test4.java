package homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 写一个卖票的程序，
 * <p>
 * 1. 写一个类，该类继承Thread，定义一个变量记录总票数。
 * <p>
 * 1. 开启四个卖票窗口(开始四个线程),同时执行卖票的程序。
 * 要求每卖一张票在控制台输出：当前窗口为：窗口a卖了一张票，剩余票数为19。其中窗口a为线程的名字。
 */
public class Test4 {
    public static void main(String[] args) {
        new Count("窗口a").start();
        new Count("窗口b").start();
        new Count("窗口c").start();
        new Count("窗口d").start();
    }
}

class Count extends Thread {
    private static AtomicInteger atomicInteger = new AtomicInteger(100);

    public Count(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            if (atomicInteger.get() > 0) {
                System.out.println(Thread.currentThread().getName()
                        + "卖了一张票，剩余票数为" + atomicInteger.decrementAndGet());
            } else {
                break;
            }
        }
    }
}