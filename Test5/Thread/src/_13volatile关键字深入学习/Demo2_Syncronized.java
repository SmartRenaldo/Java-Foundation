package _13volatile关键字深入学习;

public class Demo2_Syncronized {
    public static void main(String[] args) {
        MyThread2 thread2 = new MyThread2();
        thread2.start();

        while (true) {
            synchronized (thread2) {
                if (thread2.isFlag()){
                    System.out.println("Main thread execution");
                }
            }
        }
    }
}

class MyThread2 extends Thread{
    // 定义成员变量
    private boolean flag = false;

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