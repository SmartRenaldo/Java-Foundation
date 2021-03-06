package _07TCP通信四;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 拓展：（了解）
 * <p>
 * 引入：
 * 我们之前引入的线程解决一个服务端可以接收多个客户端消息
 * 客户端与服务端的线程模型是： N-N的关系。 一个客户端要一个线程。
 * 这种模型是不行的，并发越高，系统瘫痪的越快！！
 * <p>
 * 解决：
 * 我们可以在服务端引入线程池，使用线程池来处理与客户端的消息通信！！
 * 线程池不会引起出现过多的线程而导致系统死机！！
 * <p>
 * 这种方案的优劣势：
 * 优势：不会引起系统的死机，可以控制并发线程的数量。
 * 劣势：同时可以并发的线程将受到限制。
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("---------Client started---------");
        Socket socket = new Socket("127.0.0.1", 6789);
        PrintStream ps = new PrintStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Say: ");
            ps.println(scanner.nextLine());
        }
    }
}
