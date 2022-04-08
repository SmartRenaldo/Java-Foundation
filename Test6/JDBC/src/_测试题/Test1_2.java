package _测试题;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * 运行以下脚本创建表my_employees
 * create table users(
 * id int,
 * userid varchar(10),
 * department_id int
 * )
 *
 * @author Gavin
 */
public class Test1_2 {
    public static void main(String[] args) throws Exception {
        Properties info = new Properties();
        info.load(new FileInputStream("JDBC\\src\\_测试题\\jdbc.properties"));

        String driver = info.getProperty("driver");
        String url = info.getProperty("url");
        String user = info.getProperty("user");
        String password = info.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "create table users(\n" +
                "id int,\n" +
                "userid varchar(10),\n" +
                "department_id int\n" +
                ")";

        PreparedStatement statement = connection.prepareStatement(sql);

        boolean execute = statement.execute();

        System.out.println("execute = " + execute);

        System.out.println(execute == true ? "success" : "failed");

        statement.close();
        connection.close();
    }
}
