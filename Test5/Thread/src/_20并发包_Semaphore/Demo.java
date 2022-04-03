package _20并发包_Semaphore;

import java.util.concurrent.Semaphore;

/*
    目标：Semaphore的使用介绍。

    引入：
         Semaphore（发信号）的主要作用是控制线程的并发数量。
         synchronized可以起到"锁"的作用，但某个时间段内，只能有一个线程允许执行。
         Semaphore可以设置同时允许几个线程执行。
         Semaphore字面意思是信号量的意思，它的作用是控制访问特定资源的线程数目。
    Semaphore的构造器：
         public Semaphore(int permits)：	permits 表示许可线程的数量
         public Semaphore(int permits, boolean fair)：fair 表示公平性，如果这个设为 true 的话，
         下次执行的线程会是等待最久的线程
    Semaphore的方法：
         public void acquire() throws InterruptedException	表示获取许可
         public void release() 表示释放许可

    小结：
         Semaphore可以控制并发线程同时进行的数量。
 */
public class Demo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 5; i++) {
            String format = "Thread-" + i;
            new MyThread(new Service(semaphore), format).start();
        }
    }
}

class MyThread extends Thread {
    private Service service;

    @Override
    public void run() {
        this.service.loginAndOut();
    }

    public MyThread() {
    }

    public MyThread(Service service) {
        this.service = service;
    }

    public MyThread(Service service, String name) {
        super(name);
        this.service = service;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}

class Service {
    private Semaphore semaphore;

    public Service() {
    }

    public Service(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void loginAndOut() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " logged in at " + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " logged out at " + System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public void setSemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
}
