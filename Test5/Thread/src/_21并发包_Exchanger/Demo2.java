package _21并发包_Exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Demo2 {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Boy2(exchanger).start();
        new Girl2(exchanger).start();
    }
}

class Boy2 extends Thread {
    private Exchanger<String> exchanger;

    public Boy2(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("A boy is making a lock");
            String exchange = exchanger.exchange("a lock",5000, TimeUnit.MILLISECONDS);
            System.out.println("The boy received " + exchange);
        } catch (InterruptedException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}

class Girl2 extends Thread {
    private Exchanger<String> exchanger;

    public Girl2(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("A girl is making a key");
            Thread.sleep(6000);
            String exchange = exchanger.exchange("a key");
            System.out.println("The girl received " + exchange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}