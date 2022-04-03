package _6线程安全._01局部变量是线程安全的;

/**
 * 局部变量不存在线程安全问题，永远都是线程安全的，这是因为局部变量是私有的
 */
public class Demo {
    public static void main(String[] args) {
        Service service = new Service();
        new ThreadA(service).start();
        new ThreadB(service).start();
    }
}

class Service {
    public void set(String name) {
        int num;
        if ("a".equals(name)) {
            num = 100;
            System.out.println("a set over");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            num=200;
            System.out.println("b set over");
        }
        System.out.println("name = " + name + ", num = " + num);
    }
}

class ThreadA extends Thread{
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.set("a");
    }
}

class ThreadB extends Thread{
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.set("b");
    }
}