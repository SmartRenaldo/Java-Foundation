package _测试题;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * 向my_employees表中插入下列数据
 *
 * @author Gavin
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        Properties info = new Properties();
        info.load(new FileInputStream("JDBC\\src\\_测试题\\jdbc.properties"));

        String driver = info.getProperty("driver");
        String url = info.getProperty("url");
        String user = info.getProperty("user");
        String password = info.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "insert into my_employees values (1,'patel','Ralph','Rpatel',895), " +
                "(2,'Dancs','Betty','Bdancs',860), (3,'Biri','Ben','Bbiri',1100), " +
                "(4,'Newman','Chad','Cnewman',750), (5,'Ropeburn','Audrey','Aropebur',1550)";

        PreparedStatement statement = connection.prepareStatement(sql);

        int update = statement.executeUpdate();

        System.out.println(update > 0 ? update + " lines updated" : "failed");

        statement.close();
        connection.close();
    }
}
