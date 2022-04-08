package homework.Test10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用等待唤醒,实现一个线程给共享对象Person的属性(姓名,性别)赋值,一个线程打印共享对象的属性要求赋值-
 * >打印->赋值->打印 ... 不允许出现人妖.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.submit(new Input(person));
        pool.submit(new Output(person));
    }
}
