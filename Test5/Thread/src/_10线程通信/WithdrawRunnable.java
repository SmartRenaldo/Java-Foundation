package _10线程通信;

public class WithdrawRunnable implements Runnable {
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
            account.withdrawMoney(MONEY);
        }
    }

    public WithdrawRunnable() {
    }

    public WithdrawRunnable(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
