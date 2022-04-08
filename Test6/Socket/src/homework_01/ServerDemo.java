package homework_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

public class ServerDemo {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(ss.accept().getInputStream()));
            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
