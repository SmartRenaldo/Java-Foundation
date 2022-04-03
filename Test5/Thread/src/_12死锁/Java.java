package _12死锁;

public class Java {
    // 1.至少需要两个资源，每个资源只需要1份
    public static final Object RESOURCE1 = new Object();
    public static final Object RESOURCE2 = new Object();

    public static void main(String[] args) {
        // 2.创建2个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (RESOURCE1) {
                    System.out.println("Thread 1 takes RESOURCE1, and requests RESOURCE2.");
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (RESOURCE2) {
                        System.out.println("Thread 1 takes RESOURCE2");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (RESOURCE2) {
                    System.out.println("Thread 2 takes RESOURCE2, and requests RESOURCE1.");
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (RESOURCE1) {
                        System.out.println("Thread 2 takes RESOURCE1");
                    }
                }
            }
        }).start();
    }
}
