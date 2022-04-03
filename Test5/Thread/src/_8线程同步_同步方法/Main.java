package _8线程同步_同步方法;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100000, "ICBC-007");
        WithdrawRunnable withdrawRunnable = new WithdrawRunnable(account);
        Thread ming = new Thread(withdrawRunnable,"Ming");
        ming.start();
        Thread hong = new Thread(withdrawRunnable, "Hong");
        hong.start();
    }
}
