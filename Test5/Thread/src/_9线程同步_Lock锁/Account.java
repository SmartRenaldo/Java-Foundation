package _9线程同步_Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double money;
    private String id;
    // 创建一把锁对象:因为账户对象对于小明小红是唯一的，所以这里的锁对象对于小明小红也是唯一的
    private final Lock lock = new ReentrantLock();

    public void withdraw(double money) {
        String name = Thread.currentThread().getName();
        // 上锁
        lock.lock();
        try {
            if (this.money >= money) {
                System.out.printf("%s came to get the money, and the balance was sufficient. " +
                        "%.2f yuan was taken out.\n", name, money);
                this.money -= money;
                System.out.printf("The remaining balance of this account is %.2f\n", this.money);
            } else {
                System.out.printf("%s came to get the money, and the balance was insufficient. " +
                        "Withdraw failed.\n", name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 解锁
            lock.unlock();
        }
    }

    public Account() {
    }

    public Account(double money, String id) {
        this.money = money;
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
