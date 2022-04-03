package _3线程的常用API;

/**
 * 目标：通过Thread类的有参数构造器为当前线程对象取名字。
 * -- public Thread()
 * -- public Thread(String name):创建线程对象并取名字。
 */

public class ThreadDemo3 {
    // 启动这个类，这个类就是进程，它自带一个主线程，
    // 是main方法，main就是一个主线程的执行！！
    public static void main(String[] args) {
        MyThread2 thread1 = new MyThread2("Thread 1");
        thread1.start();
        MyThread2 thread2 = new MyThread2("Thread 2");
        thread2.start();

        Thread.currentThread().setName("Super thread");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " running " + i);
        }
    }
}

class MyThread2 extends Thread {
    //  public Thread(String name):父类的有参数构造器
    public MyThread2(String name) {
        super(name);    // 调用父类的有参数构造器初始化当前线程对象的名称
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread().getName() + " running " + i);
        }
    }
}
