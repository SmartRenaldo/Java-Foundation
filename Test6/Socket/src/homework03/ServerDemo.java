package homework03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo {
    public static void main(String[] args) {
        try {
            System.out.println("---------Server started---------");
            ServerSocket ss = new ServerSocket(23333);
            Socket socket = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream ps = new PrintStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);

            while (true){
                System.out.println("Client: " + br.readLine());
                System.out.print("Say: ");
                String string = scanner.nextLine();

                if ("exit".equalsIgnoreCase(string)) {
                    break;
                }

                ps.println(string);
            }

            ps.close();
            br.close();
            socket.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
