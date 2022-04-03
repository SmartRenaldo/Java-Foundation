package _19并发包_CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/*
    目标： CyclicBarrier

    CyclicBarrier作用：
        某个线程任务必须等待其他线程执行完毕以后才能最终触发自己执行。
    例如：公司召集5名员工开会，等5名员工都到了，会议开始。
        我们创建5个员工线程，1个开会任务，几乎同时启动
        使用CyclicBarrier保证5名员工线程全部执行后，再执行开会线程。
    构造器：
         public CyclicBarrier(int parties, Runnable barrierAction)
         // 用于在线程到达屏障5时，优先执行barrierAction，方便处理更复杂的业务场景
    方法：
         public int await()
         // 每个线程调用await方法告诉CyclicBarrier我已经到达了屏障，然后当前线程被阻塞
    小结：
        可以实现多线程中，某个任务在等待其他线程执行完毕以后触发。
        循环屏障可以实现达到一组屏障就触发一个任务执行！
 */
public class Demo {
    public static void main(String[] args) {
        // 1.创建一个任务循环屏障对象。
        /*
         * 参数一：代表多少个线程的执行。
         * 参数二：到达执行屏障就开始触发的线程任务。
         */
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new MeetingRunnable());
        EmployeeRunnable employeeRunnable = new EmployeeRunnable(cyclicBarrier);

        for (int i = 1; i <= 10; i++) {
            String format = "Employee" + i;
            new Thread(employeeRunnable, format).start();
        }
    }
}

class EmployeeRunnable implements Runnable {
    private CyclicBarrier cyclicBarrier;

    public EmployeeRunnable() {
    }

    EmployeeRunnable(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is walking to the conference room.");
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public CyclicBarrier getCyclicBarrier() {
        return cyclicBarrier;
    }

    public void setCyclicBarrier(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }
}

class MeetingRunnable implements Runnable {
    private CyclicBarrier cyclicBarrier;

    MeetingRunnable() {

    }

    MeetingRunnable(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is holding the meeting.");
    }
}
