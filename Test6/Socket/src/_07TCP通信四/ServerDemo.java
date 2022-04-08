package _07TCP通信四;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ThreadPoolExecutor;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("---------Server started---------");
        ServerSocket ss = new ServerSocket(6789);
        HandleSocketThreadPool pool = new HandleSocketThreadPool(3, 100);
        while (true) {
            pool.execute(new ReaderClientRunnable(ss.accept()));
        }
    }
}
