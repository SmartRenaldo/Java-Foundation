package _09文件上传演示;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class UploadRunnable implements Runnable {
    private Socket socket;

    public UploadRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                    Constant.DESK_FILE + UUID.randomUUID().toString() + ".jpg"));
            byte[] buffer = new byte[Constant.KB];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }

            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("Thanks for your sharing");
            ps.flush();
            bos.close();

            Thread.sleep(5000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
