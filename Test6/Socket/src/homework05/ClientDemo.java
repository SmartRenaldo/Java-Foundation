package homework05;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 8.1 训练知识点
 * 1. 实现多用户的注册登录。
 * 8.2 训练描述
 * 1. 服务端可以接收多个用户的请求连接。
 * 2. 客户端登录发送用户名和密码，格式： jack=123456
 * 用户名和密码通过键盘录入。
 * 3. 服务器端接收到用户名和密码之后，查询本地用来存储注册信息的文件
 * 判断用户名是否存在，如果用户名存在，则判断密码是否正确，如果密码不正确，则提示客端户密码错
 * 误，如果密码正确，则提示客户端登录成功。
 * 如果用户名不存在，则使用接收到的用户名和密码注册一个账号，注册成功则提示客户端注册成功。注
 * 册失败则提示客户端注册失败。
 */
public class ClientDemo {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            PrintStream ps = new PrintStream(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter username: ");
            String username = scanner.nextLine();
            System.out.print("Please enter password: ");
            String password = scanner.nextLine();

            ps.println(username);
            ps.println(password);
            ps.flush();

            // 告诉服务端我的数据已经发送完毕，请不要再等我了
            //不进行此不操作服务端会一直继续等待新内容
            socket.shutdownOutput();

            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(bf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
