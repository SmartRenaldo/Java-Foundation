package _09文件上传演示;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(Constant.SERVER_PORT);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                3,10,120L,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
        while (true){
            executor.execute(new UploadRunnable(ss.accept()));
        }
    }
}
