package _06TCP通信三;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 目标：实现一个服务端可以同时接收多个客户端的消息。
 * <p>
 * 总结：
 * 需要在服务端引入多线程。
 * 每接收一个客户端的Socket通道，就为它分配一个独立的线程来处理它的消息。
 * 如此便可实现：一个服务端可以同时接收多个客户端的消息。
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("---------Client started---------");
        Socket socket = new Socket("127.0.0.1", 12345);
        PrintStream ps = new PrintStream(socket.getOutputStream());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Say: ");
            ps.println(scanner.nextLine());
            ps.flush();
        }
    }
}
