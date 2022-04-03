package _14原子性介绍;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 目标：原子性。
 * <p>
 * 概述：所谓的原子性是指在一次操作或者多次操作中，
 * 所有的操作全部都得到了执行并且不会受到任何因素的干扰。最终结果要保证线程安全。
 * <p>
 * 小结：在多线程环境下，volatile关键字可以保证共享数据的可见性，
 * 但是并不能保证对数据操作的原子性（在多线程环境下volatile修饰的变量也是线程不安全的）。
 * volatile的使用场景
 * - 开关控制
 * 利用可见性特点，控制某一段代码执行或者关闭(比如今天课程的第一个案例)。
 * - 多个线程操作共享变量，但是是有一个线程对其进行写操作，其他的线程都是读。此时加上更好，
 * 其他线程可以立即读取到最新值。
 * volatile不能保证变量操作的原子性（安全性）
 */
public class Demo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        ExecutorService pool2 = Executors.newFixedThreadPool(3);
        MyRunnable runnable = new MyRunnable();

        for (int i = 0; i < 100; i++) {
            pool.submit(runnable);
        }

        for (int i = 0; i < 100; i++) {
            pool2.submit(runnable);
        }
    }
}

class MyRunnable implements Runnable {
    private volatile int count;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + " --> " + count);
        }
    }
}
