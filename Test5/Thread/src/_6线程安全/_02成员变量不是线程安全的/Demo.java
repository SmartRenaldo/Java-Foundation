package _6线程安全._02成员变量不是线程安全的;

public class Demo {
    public static void main(String[] args) {
        Service service = new Service();
        new ThreadA(service).start();
        new ThreadB(service).start();
    }
}

class Service {
    private int num;

    public synchronized void set(String name) {
        if ("a".equals(name)) {
            this.num = 100;
            System.out.println("a set over");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            this.num = 200;
            System.out.println("b set over");
        }
        System.out.println("name = " + name + ", num = " + this.num);
    }
}

class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.set("a");
    }
}

class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.set("b");
    }
}