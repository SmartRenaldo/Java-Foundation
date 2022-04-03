package _10线程通信;

public class Account {
    private String id;
    private double money;

    public synchronized void saveMoney(double money) {
        try {
            if (this.money < money) {
                this.money += money;
                System.out.println(Thread.currentThread().getName() + " came to save money, and deposited "
                        + money + " yuan.");
                //唤醒别人,等待自己
                this.notifyAll();
                this.wait();
            } else {
                System.out.println(Thread.currentThread().getName() + " came to save money" +
                        ", and the balance was sufficient. No money is saved.");
                //唤醒别人,等待自己
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void withdrawMoney(double money) {
        try {
            if (this.money >= money) {
                this.money -= money;
                System.out.println(Thread.currentThread().getName() + " came to withdraw money, and withdrawn "
                        + money + " yuan.");
                //唤醒别人,等待自己
                this.notifyAll();
                this.wait();
            } else {
                System.out.println(Thread.currentThread().getName() + " came to save money" +
                        ", and the balance was insufficient. No money is withdrawn.");
                //唤醒别人,等待自己
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Account() {
    }

    public Account(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}