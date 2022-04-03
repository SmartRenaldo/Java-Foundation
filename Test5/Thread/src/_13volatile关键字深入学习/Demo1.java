package _13volatile关键字深入学习;

public class Demo1 {
    public static void main(String[] args) {
        // 1.启动线程，把线程对象中的flag改为true
        MyThread thread = new MyThread();
        thread.start();

        // 2.定义一个死循环
        while (true) {
            // 这里读取到了flag值一直是false,虽然线程已经把它的值改成了true
            if (thread.isFlag()) {
                System.out.println("Main thread execution");
            }
        }
    }
}

class MyThread extends Thread{
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