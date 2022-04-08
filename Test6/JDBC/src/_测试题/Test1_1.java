package _测试题;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * 1. 运行以下脚本创建表my_employees
 * Create table my_employees(
 * Id int(10),
 * First_name varchar(10),
 * Last_name varchar(10),
 * Userid varchar(10),
 * Salary double(10,2)
 * )
 *
 * @author Gavin
 */
public class Test1_1 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("JDBC\\src\\_测试题\\jdbc.properties"));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "Create table my_employees(" +
                "Id int(10)," +
                "First_name varchar(10)," +
                "Last_name varchar(10)," +
                "Userid varchar(10)," +
                "Salary double(10,2)" +
                ")";

        PreparedStatement statement = connection.prepareStatement(sql);

        int update = statement.executeUpdate();

        System.out.println("update = " + update);

        System.out.println(update > 0 ? "success" : "failed");

        statement.close();
        connection.close();
    }
}
