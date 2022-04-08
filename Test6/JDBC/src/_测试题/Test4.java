package _测试题;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * 向users表中插入数据
 *
 * @author Gavin
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
        Properties info = new Properties();
        info.load(new FileInputStream("JDBC\\src\\_测试题\\jdbc.properties"));

        String driver = info.getProperty("driver");
        String url = info.getProperty("url");
        String user = info.getProperty("user");
        String password = info.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "insert into users values (1,'Rpatel',10), (2,'Bdancs',10), " +
                "(3,'Bbiri',20), (4,'Cnewman',30), (5,'Aropebur',40)";

        PreparedStatement statement = connection.prepareStatement(sql);
        int update = statement.executeUpdate();

        System.out.println(update > 0 ? update + " lines updated" : "failed");

        statement.close();
        connection.close();
    }
}
