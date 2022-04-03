package _4线程的创建_方式二;
/*
 目标：方式二的匿名内部类写法。简化写法。
 */

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        Thread thread1 = new Thread(runnable, "First thread");
        thread1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        }, "Second thread").start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
