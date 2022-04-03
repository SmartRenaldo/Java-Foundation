package _11线程池;

import java.util.concurrent.*;

/*
    目标：创建一个线程池。

    线程池在Java中的代表类：ExecutorService(接口)。

    Java在Executors类下提供了一个静态方法得到一个线程池的对象：
         1.public static ExecutorService newFixedThreadPool(int nThreads)：
            创建一个线程池返回。

    ExecutorService提交线程任务对象执行的方法：
         1.Future<?> submit(Runnable task):提交一个Runnable的任务对象给线程池执行。
         1.Future<?> submit(Callable task):提交一个Runnable的任务对象给线程池执行。
    小结：
        Callable做线程池的任务，可以得到它执行的结果！！
 */
public class Demo2_Callable {
    public static void main(String[] args) {
        // a.创建一个线程池，指定线程的固定数量是3.
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Future<String> t1 = pool.submit(new MyCallable(50));
        Future<String> t2 = pool.submit(new MyCallable(100));
        Future<String> t3 = pool.submit(new MyCallable(150));
        Future<String> t4 = pool.submit(new MyCallable(200));
        Future<String> t5 = pool.submit(new MyCallable(250));

        try {
            // b.可以得到线程池执行的任务结构
            String s1 = t1.get();
            String s2 = t2.get();
            String s3 = t3.get();
            String s4 = t4.get();
            String s5 = t5.get();
            System.out.println("s1: " + s1);
            System.out.println("s2: " + s2);
            System.out.println("s3: " + s3);
            System.out.println("s4: " + s4);
            System.out.println("s5: " + s5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable {
    private int n;

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += n;
        }
        return Thread.currentThread().getName() + " --> " + sum;
    }

    public MyCallable() {
    }

    public MyCallable(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}