package homework01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerDemo {
    public static void main(String[] args) {
        System.out.println("---------Server started---------");
        byte[] buffer = new byte[1024 * 64];
        try (DatagramSocket socket = new DatagramSocket(7777)) {
            //创建一个接收客户都端的数据包对象（集装箱）
            //接收端用：
            //new DatagramPacket(byte[] buf, int length)
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println(ip + ":" + port + ": " + new String(buffer, 0, packet.getLength()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
