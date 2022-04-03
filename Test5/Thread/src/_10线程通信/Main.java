package _10线程通信;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("ICBC-111");
        new Thread(new WithdrawRunnable(account),"Ming").start();
        new Thread(new WithdrawRunnable(account),"Hong").start();

        new Thread(new SaveRunnable(account),"Father").start();
        new Thread(new SaveRunnable(account),"Father-in-law").start();
        new Thread(new SaveRunnable(account),"Godfather").start();
    }
}
