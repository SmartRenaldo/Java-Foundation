package homework;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 有一辆班车除司机外只能承载80个人，假设前中后三个车门都能上车，如果坐满则不能再上车。请用线程模拟
 * 上车过程并且在控制台打印出是从哪个车门上车以及剩下的座位数。
 * 比如:（前门上车---还剩N个座...）
 */
public class Test3 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        int maxNum = 80;
        for (int i = 0; i < maxNum; i++) {
            pool.submit(new Car(maxNum));
        }
    }
}

class Car implements Runnable {
    private static int leftNum;

    public Car(int maxNum) {
        leftNum = maxNum;
    }

    @Override
    public void run() {
        System.out.println(getPosition() + "上车,还剩" + --leftNum + "个座");
    }

    public String getPosition() {
        int tmp = new Random().nextInt(3);
        if (tmp == 0) return "前门";
        if (tmp == 1) return "中门";
        return "后门";
    }
}
