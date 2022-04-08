package _08打印流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo02 {
    public static void main(String[] args) {
        System.out.println("哈哈哈哈哈哈哈哈哈哈哈哈哈哈");

        try (final PrintStream ps = new PrintStream(new FileOutputStream("IO2/src/_08打印流/log.txt"));
             PrintStream out = System.out;
        ) {
            System.setOut(ps);
            System.out.println("我在学JAVA");
            System.out.println("牛肉");
            System.out.println("You are crazy");
            System.out.println("Android");
            System.out.println("峰");
            System.setOut(out);
            System.out.println("You are crazy");
            System.out.println("Android");
            System.out.println("峰");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
