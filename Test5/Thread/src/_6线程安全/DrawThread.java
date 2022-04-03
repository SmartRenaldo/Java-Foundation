package _6线程安全;

// 线程类：创建取钱线程对象的
public class DrawThread extends Thread{
    // 定义一个成员变量接收账户对象
    private Account account;

    public DrawThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        // 小明 小红
        // 取钱100000
        account.drawMoney(100000);
    }
}
