package _03UDP通信;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 目标：UDP服务端开发。接收客户端的消息。
 *
 * @author Gavin
 */
public class UDPServerDemo {
    public static void main(String[] args) {
        System.out.println("--------Server started--------");
        byte[] buffer = new byte[1024 * 64];
        try (// 创建一个接收端的码头对象
             DatagramSocket socket = new DatagramSocket(6789)) {
            //创建一个接收客户都端的数据包对象（集装箱）
            //接收端用：
            //new DatagramPacket(byte[] buf, int length)
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            // 开始接收
            socket.receive(packet);
            // 从集装箱中获取本次读取的数据量
            int len = packet.getLength();
            // 输出数据
            String str = new String(buffer, 0, len);
            System.out.println(str);
            // 服务端还可以获取发来信息的客户端的IP和端口
            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println("Client: " + ip + ": " + port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
