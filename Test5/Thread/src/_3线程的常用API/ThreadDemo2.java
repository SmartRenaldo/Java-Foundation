package _3线程的常用API;

/**
 * 目标：线程休眠API.
 * public static void sleep(long time): 让当前线程休眠多少毫秒再继续执行。
 */

public class ThreadDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                // 项目经理让我加上这行代码
                // 如果用户交钱了，我就去掉。    // 让当前线程休眠1s.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
