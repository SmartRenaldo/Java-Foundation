package homework;

import java.util.Random;

public class Test3_2 {
    public static void main(String[] args) {
        Car2 car2 = new Car2();
        new Thread(car2, "前门").start();
        new Thread(car2, "中门").start();
        new Thread(car2, "后门").start();
    }
}

class Car2 implements Runnable {
    private static int leftNum = 80;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (leftNum > 0) {
                    System.out.println(Thread.currentThread().getName() + "上车,还剩" + --leftNum + "个座");
                } else {
                    break;
                }
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

