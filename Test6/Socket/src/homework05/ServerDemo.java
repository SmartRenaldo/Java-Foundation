package homework05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Set;

public class ServerDemo {
    private static final String PATHNAME = "D:\\IdeaProjects\\Test\\通信\\src\\homework05\\users.properties";

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            Socket socket = ss.accept();
            PrintStream ps = new PrintStream(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(PATHNAME));
            Properties properties = new Properties();
            properties.load(bis);
            Set<String> keys = properties.stringPropertyNames();

            String username = br.readLine();
            String password = br.readLine();

            boolean flag = true;
            for (String key : keys) {
                if (key.equals(username)) {
                    String value = properties.getProperty(key);
                    if (password.equals(value)) {
                        ps.println("User already exists");
                    } else {
                        ps.println("Password error!");
                    }
                    flag = false;
                }
            }

            if (flag) {
                properties.setProperty(username, password);
                properties.store(new BufferedOutputStream(new FileOutputStream(PATHNAME)),
                        "new user added");
                ps.println("User added successfully");
            }

            ps.flush();

            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
