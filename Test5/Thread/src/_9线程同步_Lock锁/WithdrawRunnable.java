package _9线程同步_Lock锁;

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
