package homework_01;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 4.1． 训练知识点
 * 1. TCP服务器代码实现
 * 4.2． 训练描述
 * 在项目下创建TCP 服务器端 端口号为8888
 * 1：等待客户端连接 如果有客户端连接 获取到客户端对象。
 * 2：获取到客户端对象之后读取数据客户端传送数据并输出到控制台。
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        PrintStream ps = new PrintStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Say: ");
            ps.println(scanner.nextLine());
        }
    }
}
