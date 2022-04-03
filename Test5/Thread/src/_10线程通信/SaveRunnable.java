package _10线程通信;

public class SaveRunnable implements Runnable {
    private Account account;
    private final static double MONEY = 100000;
    private final static int TIME = 2000;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(TIME);
            } catch (Exception e) {
                e.printStackTrace();
            }
            account.saveMoney(MONEY);
        }
    }

    public SaveRunnable(Account account) {
        this.account = account;
    }

    public SaveRunnable() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
