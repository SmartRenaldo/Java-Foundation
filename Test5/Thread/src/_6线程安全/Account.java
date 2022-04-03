package _6线程安全;


public class Account {
    private String cardID;
    private double money;

    // 小明线程/小红线程
    public void drawMoney(double money) {
        // 开始判断取钱逻辑
        // 1.先知道是谁来取钱
        String name = Thread.currentThread().getName();
        // 2.判断余额是否足够
        if (this.money >= money) {
            this.money -= money;
            System.out.printf("%s came to get the money, and the balance was sufficient." +
                    " %.2f yuan was taken out.\n", name, money);
            System.out.printf("The remaining balance of the account is %.2f\n", this.money);
        } else {
            System.out.printf("%s came to get the money, and the balance was insufficient.\n", name);
        }
    }

    public Account() {
    }

    public Account(String cardID, double money) {
        this.cardID = cardID;
        this.money = money;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}
