package _05TCP通信二;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目标：开发服务器。
 * 1.注册端口。
 * 2.接收客户端的Socket管道连接。
 * 3.从socket通信管道中得到一个字节输入流。
 * 4.从字节输入流中读取客户端发来的数据。
 * ServerSocket类：
 * 构造器：public ServerSocket(int port)
 * 方法：public Socket accept()：
 * -- 等待接收一个客户端的Socket管道连接请求，连接成功返回一个Socket对象
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("---------Server started---------");
        ServerSocket ss = new ServerSocket(9999);
        Socket socket = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String lineMsg;
        while ((lineMsg = br.readLine()) != null) {
            System.out.println(lineMsg);
        }
    }
}
