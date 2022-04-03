package _21并发包_Exchanger;

import java.util.concurrent.Exchanger;

/*
    目标：Exchanger

    作用
        Exchanger（交换者）是一个用于线程间协作的工具类。Exchanger用于进行线程间的数据交换。
        这两个线程通过exchange方法交换数据，如果第一个线程先执行exchange()方法，它会一直等待第二个线程也执行exchange方法，
        当两个线程都到达同步点时，这两个线程就可以交换数据，将本线程生产出来的数据传递给对方。
    Exchanger构造方法：
        public Exchanger()
    Exchanger重要方法：
        public V exchange(V x)
    分析：
        （1）需要2个线程
        （2）需要一个交换对象负责交换两个线程执行的结果。

    小结：
        Exchanger可以实现线程间的数据交换。
        一个线程如果等不到对方的数据交换就会一直等待。
        我们也可以控制一个线程等待的时间。
        必须双方都进行交换才可以正常进行数据的交换。
 */
public class Demo1 {
    public static void main(String[] args) {
        // 创建交换对象（信使）
        Exchanger<String> exchanger = new Exchanger<>();
        // 创建2给线程对象
        new Boy(exchanger).start();
        new Girl(exchanger).start();
    }
}

class Boy extends Thread {
    private Exchanger<String> exchanger;

    public Boy(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println("A boy is making a lock");
        String string = null;
        try {
            string = exchanger.exchange("a lock");
            System.out.println("The boy received " + string);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Girl extends Thread {
    private Exchanger<String> exchanger;

    public Girl(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println("A girl is making a key");
        String string = null;
        try {
            string = exchanger.exchange("a key");
            System.out.println("The girl received " + string);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}