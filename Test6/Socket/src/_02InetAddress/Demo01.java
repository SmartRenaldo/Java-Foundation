package _02InetAddress;

import java.net.InetAddress;

/**
 * 目标：InetAddress类概述
 * 一个该类的对象就代表一个IP地址对象。
 * InetAddress类成员方法：
 * static InetAddress getLocalHost()
 * * 获得本地主机IP地址对象。
 * static InetAddress getByName(String host)
 * * 根据IP地址字符串或主机名获得对应的IP地址对象。
 * String getHostName()
 * * 获得主机名。
 * String getHostAddress()
 * * 获得IP地址字符串。
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        // 1.获取本机地址对象
        InetAddress ip01 = InetAddress.getLocalHost();
        System.out.println("ip01.getHostName() = " + ip01.getHostName());
        System.out.println("ip01.getHostAddress() = " + ip01.getHostAddress());

        // 2.获取域名ip对象
        InetAddress ip02 = InetAddress.getByName("www.baidu.com");
        System.out.println("ip02.getHostName() = " + ip02.getHostName());
        System.out.println("ip02.getHostAddress() = " + ip02.getHostAddress());

        // 3.获取公网IP对象
        InetAddress ip03 = InetAddress.getByName("103.235.46.39");
        System.out.println("ip03.getHostName() = " + ip03.getHostName());
        System.out.println("ip03.getHostAddress() = " + ip03.getHostAddress());

        // 4.判断是否能通： ping  5s之前测试是否可通
        System.out.println("ip02.isReachable(5000) = " + ip02.isReachable(5000));   // ping
    }
}
