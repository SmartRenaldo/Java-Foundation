package _7线程同步_同步代码块;

public class WithdrawRunnable implements Runnable{
    Account account = new Account();

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
