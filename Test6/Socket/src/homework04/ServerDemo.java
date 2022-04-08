package homework04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerDemo {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(55555);
            Socket socket = ss.accept();
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                    Constant.DESK_FILE+ UUID.randomUUID().toString()+".jpg"));

            byte[] buffer = new byte[Constant.KB];
            int len;
            while ((len= bis.read(buffer))!=-1){
                bos.write(buffer);
            }
            bos.flush();

            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("传输完毕");
            ps.flush();

            ps.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
