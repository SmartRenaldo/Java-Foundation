package _8线程同步_同步方法;

public class WithdrawRunnable implements Runnable{
    Account account;

    public WithdrawRunnable() {
    }

    public WithdrawRunnable(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(100000);
    }
}
