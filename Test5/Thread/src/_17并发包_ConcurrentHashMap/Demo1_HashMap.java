package _17并发包_ConcurrentHashMap;

import java.util.HashMap;
import java.util.Map;

/*
    目标：并发包的介绍。(面试的重点中的重点)

    并发包的来历：
        在实际开发中如果不需要考虑线程安全问题，大家不需要做线程安全，因为如果做了反而性能不好！
        但是开发中有很多业务是需要考虑线程安全问题的，此时就必须考虑了。否则业务出现问题。
        Java为很多业务场景提供了性能优异，且线程安全的并发包，程序员可以选择使用！

    Map集合中的经典集合：HashMap它是线程不安全的，性能好
        -- 如果在要求线程安全的业务情况下就不能用这个集合做Map集合，否则业务会崩溃~
    为了保证线程安全，可以使用Hashtable。注意：线程中加入了计时
        -- Hashtable是线程安全的Map集合，但是性能较差！(已经被淘汰了，虽然安全，但是性能差)
    为了保证线程安全，再看ConcurrentHashMap（不止线程安全，而且效率高，性能好，最新最好用的线程安全的Map集合）
        -- ConcurrentHashMap保证了线程安全，综合性能较好！
    小结：
        HashMap是线程不安全的。
        Hashtable线程安全基于synchronized，综合性能差,被淘汰了。
        ConcurrentHashMap：线程安全的，分段式锁，综合性能最好，线程安全开发中推荐使用
 */
public class Demo1_HashMap {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            thread1.join();     //让thread1跑完
            thread2.join();     //让thread2跑完
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("runnable.getMap().size() = " + runnable.getMap().size());
        long end = System.currentTimeMillis();
        double s = (end - start) / 1000.0;
        System.out.printf("It took %.2fs\n", s);
    }
}

class MyRunnable implements Runnable {
    private Map<String, String> map = new HashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 5000000; i++) {
            map.put(Thread.currentThread().getName() + i, i + "");
        }
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
