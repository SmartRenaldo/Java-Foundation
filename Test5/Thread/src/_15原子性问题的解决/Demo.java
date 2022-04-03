package _15原子性问题的解决;

import java.util.concurrent.*;

/*
    目标：问题解决。

    如何保证变量访问的原子性呢?
        1.加锁实现线程安全。
        2.基于CAS方式的原子类。
 */
public class Demo {
    public static void main(String[] args) {
        ExecutorService pool1 = Executors.newFixedThreadPool(3);
        ExecutorService pool2 = Executors.newFixedThreadPool(3);
        MyCallable callable = new MyCallable();
        Future<String> future;
        String string;

        for (int i = 0; i < 10000; i++) {
            future = pool1.submit(callable);
            try {
                string = future.get();
                System.out.println(string);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 10000; i++) {
            future = pool2.submit(callable);
            try {
                string = future.get();
                System.out.println(string);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyCallable implements Callable {
    private int count;

    @Override
    public Object call() throws Exception {
        synchronized (this) {
            count++;
        }
        return Thread.currentThread().getName() + " --> " + count;
    }
}