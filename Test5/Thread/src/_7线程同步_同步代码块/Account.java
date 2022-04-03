package _7线程同步_同步代码块;

public class Account {
    private double money;
    private String id;

    public void withdraw(double money) {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            if (this.money >= money) {
                System.out.printf("%s came to get the money, and the balance was sufficient. " +
                        "%.2f yuan was taken out.\n", name, money);
                this.money -= money;
                System.out.printf("The remaining balance of this account is %.2f\n", this.money);
            } else {
                System.out.printf("%s came to get the money, and the balance was insufficient. " +
                        "Withdraw failed.\n", name);
            }
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
