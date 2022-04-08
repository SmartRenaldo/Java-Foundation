package _09文件上传演示;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(Constant.SERVER_IP, Constant.SERVER_PORT);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(Constant.SRC_FILE));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] buffer = new byte[Constant.KB];
        int len;
        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        // 刷新图片数据到服务端
        bos.flush();
        // 告诉服务端我的数据已经发送完毕，请不要再等我了
        //不进行此不操作服务端会一直继续等待新内容
        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());
        bis.close();
    }
}
