package homework04;

import java.io.*;
import java.net.Socket;

/**
 * 7.1． 训练知识点
 * 1. TCP文件上传案例
 * 7.2． 训练描述
 * 将文件上传到指定IP的主机
 * TCP的服务端可以接受多个客户端的连接
 * TCP的客户端上传文件到服务器端
 * 文件保存到c:/java/file 文件下，文件名随机生成，只要不出现文件覆盖即可。
 * 服务器端需要反馈上传状态(成功或失败)给客户端。
 */
public class ClientDemo {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 55555);
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(Constant.SRC_FILE));
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
            byte[] buffer = new byte[Constant.KB];

            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            bos.flush();

            socket.shutdownOutput();

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(br.readLine());

            br.close();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
