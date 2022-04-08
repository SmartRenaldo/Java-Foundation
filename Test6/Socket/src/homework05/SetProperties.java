package homework05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SetProperties {
    private static final String PATHNAME = "D:\\IdeaProjects\\Test\\通信\\src\\homework05\\users.properties";
    private static final Properties properties = new Properties();

    public static void main(String[] args) {
        properties.setProperty("admin", "123456");
        properties.setProperty("Lucy", "QWERTY");
        properties.setProperty("Catherine", "11111");
        properties.setProperty("Kate", "1113465");

        try {
            properties.store(new FileOutputStream(PATHNAME), "usernames and passwords");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
