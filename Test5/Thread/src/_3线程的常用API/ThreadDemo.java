package _3线程的常用API;

/**
 * 目标：线程的常用API.
 * <p>
 * Thread类的API:
 * 1.public void setName(String name):给当前线程取名字。
 * 2.public void getName():获取当前线程的名字。
 * -- 线程存在默认名称，子线程的默认名称是：Thread-索引。
 * -- 主线程的默认名称就是：main
 * 3.public static Thread currentThread()
 * -- 获取当前线程对象，这个代码在哪个线程中，就得到哪个线程对象。
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        thread1.setName("Thread 1");
        thread1.start();
        Thread thread2 = new MyThread();
        thread2.setName("Thread 2");
        thread2.start();
        Thread t = Thread.currentThread();
        t.setName("The most powerful thread");
        for (int i = 0; i < 10; i++) {
            System.out.println(t.getName() + " running");
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread().getName() + " running");
        }
    }
}
