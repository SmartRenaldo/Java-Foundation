package _06TCP通信三;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("---------Server started---------");
        ServerSocket ss = new ServerSocket(12345);
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            pool.submit(new ServerReader(ss.accept()));
        }
    }
}

class ServerReader implements Runnable {
    private Socket socket;

    public ServerReader(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg;
            while ((msg = bf.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress() + ": " + msg);
            }
        } catch (IOException e) {
            System.err.println(socket.getRemoteSocketAddress() + " " + "logged out");
        }
    }
}
