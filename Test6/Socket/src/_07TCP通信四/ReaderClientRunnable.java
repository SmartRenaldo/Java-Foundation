package _07TCP通信四;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReaderClientRunnable implements Runnable {
    private Socket socket;

    public ReaderClientRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg;
            // 阻塞式的！！
            while ((msg = bf.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress() + ": " + msg);
            }
        } catch (IOException e) {
            System.err.println(socket.getRemoteSocketAddress() + " logged out!");
        }
    }
}
