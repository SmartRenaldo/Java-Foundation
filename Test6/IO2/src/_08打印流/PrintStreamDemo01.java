package _08打印流;

import java.io.PrintStream;

/**
 * 目标：打印流PrintStream / PrintWriter.
 * <p>
 * 打印流的作用：
 * 1.可以方便，快速的写数据出去。
 * 2.可以实现打印啥出去，就是啥出去。
 * 打印流的构造器：
 * public PrintStream(OutputStream os):
 * public PrintStream(String filepath):
 * <p>
 * 小结：
 * 打印流可以方便，且高效的打印各种数据。
 * PrintStream不光可以打印数据，还可以写"字节数据"出去。
 * PrintWriter不光可以打印数据，还可以写"字符数据"出去。
 */
public class PrintStreamDemo01 {
    public static void main(String[] args) {
        try (// 1.打印流PrintStream
             //OutputStream os = new FileOutputStream("IO2\\src\\_08打印流\\dlei01");
             //PrintStream ps = new PrintStream(os);

             PrintStream ps = new PrintStream("IO2\\src\\_08打印流\\dlei01");
        ) {
            ps.println("开心快乐");
            ps.println(123);
            ps.println(97);
            ps.println("我在快乐调皮");

            // 写字节数据出去
            ps.write("我在学JAVA".getBytes());
            ps.write("\r\n".getBytes());
            ps.write(97);
            ps.write("\r\n".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
