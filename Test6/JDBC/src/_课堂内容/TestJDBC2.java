package _课堂内容;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 此类用于演示JDBC的使用步骤2：获取连接
 * @author Gavin
 */
public class TestJDBC2 {
    public static void main(String[] args) throws Exception {
        Properties config = new Properties();
        config.load(new FileInputStream("JDBC\\src\\_课堂内容\\jdbc.properties"));
        String user = config.getProperty("user");
        String password = config.getProperty("password");
        String url = config.getProperty("url");
        String driver = config.getProperty("driver");

        //1.注册驱动
        Class.forName(driver);

        //2.获取连接
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("Connected");
    }
}
