package _17并发包_ConcurrentHashMap;

import java.math.BigDecimal;
import java.util.Hashtable;
import java.util.Map;

public class Demo2_Hashtable {
    private static Map<String, String> map = new Hashtable<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        MyRunnable2 runnable2 = new MyRunnable2();
        Thread thread1 = new Thread(runnable2);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();     //让thread1跑完
            thread2.join();     //让thread2跑完
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
        Demo2_Hashtable.map = map;
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            Demo2_Hashtable.getMap().put(Thread.currentThread().getName() + i, i + "");
        }
    }
}
