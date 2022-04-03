package _17并发包_ConcurrentHashMap;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Demo3_ConcurrentHashMap {
    private static Map<String, String> map = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        MyRunnable3 runnable3 = new MyRunnable3();
        Thread thread1 = new Thread(runnable3);
        Thread thread2 = new Thread(runnable3);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("map.size() = " + map.size());

        long end = System.currentTimeMillis();
        BigDecimal bigDecimalStart = BigDecimal.valueOf(start);
        BigDecimal bigDecimalEnd = BigDecimal.valueOf(end);
        BigDecimal subtract = bigDecimalEnd.subtract(bigDecimalStart);
        BigDecimal divisor = BigDecimal.valueOf(1000);
        BigDecimal divide = subtract.divide(divisor);
        System.out.printf("It took %fs\n", divide);
    }

    public static Map<String, String> getMap() {
        return map;
    }

    public static void setMap(Map<String, String> map) {
        Demo3_ConcurrentHashMap.map = map;
    }
}

class MyRunnable3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            Demo3_ConcurrentHashMap.getMap().put(Thread.currentThread().getName() + i, i + "");
        }
    }
}