package _13volatile关键字深入学习;

public class Demo3_Volatile {
    public static void main(String[] args) {
        MyThread3 thread3 = new MyThread3();
        thread3.start();

        while (true) {
            if (thread3.isFlag()){
                System.out.println("Main thread execution");
            }
        }
    }
}

class MyThread3 extends Thread{
    // 定义成员变量
    // volatile可以实现变量一旦被子线程修改，其他线程可以马上看到它修改后的最新值！
    private volatile boolean flag = false;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 将flag的值更改为true
        flag = true;
        System.out.println("flag = " + flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}