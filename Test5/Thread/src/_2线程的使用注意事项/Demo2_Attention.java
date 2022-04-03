package _2线程的使用注意事项;

/*
 目标：线程的注意事项。

 1.线程的启动必须调用start()方法。否则当成普通类处理。
 -- 如果线程直接调用run()方法，相当于变成了普通类的执行，此时将只有主线程在执行他们！
 -- start()方法底层其实是给CPU注册当前线程，并且触发run()方法执行
 2.建议线程先创建子线程，主线程的任务放在之后。否则主线程永远是先执行完！
 */
public class Demo2_Attention {
    // 启动这个类，这个类就是进程，它自带一个主线程，
    // 是main方法，main就是一个主线程的执行！！
    public static void main(String[] args) {
        //创建一个新的线程对象。
        MyThreadClass thread = new MyThreadClass();
        thread.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("Main thread running " + i);
        }
    }
}

//定义一个线程类继承Thread。线程类并不是线程对象，用来创建线程对象的。
class MyThreadClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Child thread running " + i);
        }
    }
}
