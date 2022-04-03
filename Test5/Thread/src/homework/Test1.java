package homework;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 需求说明
 * 1. 请按要求编写多线程应用程序，模拟多个人通过一个山洞：
 * 这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒。
 * 随机生成10个人，同时准备过此山洞，显示每次通过山洞人的姓名。
 */
public class Test1 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Cave cave = new Cave();

        for (int i = 0; i < 10; i++) {
            pool.submit(cave);
        }
    }
}

class Cave implements Runnable {
    private static final Random SYS_RANDOM = new Random();

    @Override
    public synchronized void run() {
        int num = SYS_RANDOM.nextInt(5) + 2;
        String name = this.randomlyGetName(num);
        System.out.println(name + " reached the entrance to the cave");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " went through the cave");
    }

    public String randomlyGetName(int num) {
        StringBuilder name = new StringBuilder();
        final int UPPER = 65;
        final int LOWER = 97;
        name.append((char) (SYS_RANDOM.nextInt(26) + UPPER));
        for (int i = 0; i < num - 1; i++) {
            name.append((char) (SYS_RANDOM.nextInt(26) + LOWER));
        }
        return name.toString();
    }
}
