package homework03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 6.1． 训练知识点
 * 1. TCP协议通讯
 * 6.2． 训练描述
 * 使用TCP协议实现客户端和服务端互相发送消息。
 * 客户端发送一条消息，服务器读取之后，返回一条消息给客户端，客户端读取服务器返回的消息之后，又发送一条
 * 消息…循环执行，直到输入exit。
 * 1. 消息内容通过键盘输入
 * 2. 要求服务器端和客户端都使用字符流的方式发送和接收数据。
 * 使用BufferedReader方法readLine()读取一行数据。
 * 使用BufferedWriter方法write("字符串的数据")发送数据。
 */
public class ClientDemo {
    public static void main(String[] args) {
        try {
            System.out.println("---------Client started---------");
            Socket socket = new Socket("127.0.0.1", 23333);
            PrintStream ps = new PrintStream(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Say: ");
                String string = scanner.nextLine();

                if ("exit".equalsIgnoreCase(string)) {
                    break;
                }

                ps.println(string);
                System.out.println("Server: " + br.readLine());
            }

            ps.close();
            br.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
