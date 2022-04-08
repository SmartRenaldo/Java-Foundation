package homework01;

import java.io.IOException;
import java.net.*;

/**
 * 3.1． 训练知识点
 * 1. UDP协议通讯
 * 3.2． 训练描述
 * 使用UDP协议实现一个程序(发送端)发送信息给另一个程序(接收端)，接收端将接收到的内容打印输出即可
 */
public class ClientDemo {
    public static void main(String[] args) {
        System.out.println("---------Client started---------");
        byte[] buffer = "我在富华酒店201房".getBytes();
        //发送端用:
        //new DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        try (DatagramSocket socket = new DatagramSocket()){
            DatagramPacket packet = new DatagramPacket(
                    buffer, buffer.length, InetAddress.getLocalHost(), 7777);
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
