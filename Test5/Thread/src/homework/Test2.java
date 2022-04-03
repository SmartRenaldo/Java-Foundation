package homework;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 有100个限量版的水杯，但是只能通过实体店和官网才能进行购买，并且分别统计卖了多少。请用线程进行模拟
 * 并设置线程名称用来代表售出途径，再将信息打印出来。
 * 比如（实体店卖出第1个，总共剩余n个..）
 */
public class Test2 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(100);
        Cup cup = new Cup();
        for (int i = 0; i < 100; i++) {
            pool.submit(cup);
        }
    }
}

class Cup implements Runnable {
    private static final Random SYS_RANDOM = new Random();
    private static int physicalStoreSellNum;
    private static int onlineStoreSellNum;

    @Override
    public synchronized void run() {
        int i = SYS_RANDOM.nextInt(100);
        String store = this.getStore();

        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if ("实体店".equals(store)) {
            physicalStoreSellNum++;
            System.out.println("实体店" + "卖出第" + physicalStoreSellNum + "个杯子");
        } else if ("官网".equals(store)) {
            onlineStoreSellNum++;
            System.out.println("官网" + "卖出第" + onlineStoreSellNum + "个杯子");
        }
    }

    public String getStore() {
        int i = SYS_RANDOM.nextInt(2) % 2;
        if (i == 0) return "实体店";
        return "官网";
    }
}
