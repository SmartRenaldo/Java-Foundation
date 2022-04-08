package _05TCP通信二;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 目标：客户端可以反复发送数据，服务端可以反复数据！！
 * <p>
 * 分析：
 * 只需要让客户端通过循环进行数据的发送。
 * <p>
 * 产生的问题：
 * 目前服务端只能接收一个客户端请求。
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("---------Client started---------");
        Socket socket = new Socket("127.0.0.1", 9999);
        PrintStream ps = new PrintStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Say: ");
            ps.println(scanner.nextLine());
            ps.flush();
        }
    }
}
