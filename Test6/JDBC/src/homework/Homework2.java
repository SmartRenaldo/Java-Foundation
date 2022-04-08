package homework;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

/**
 * 二、修改指定客户
 * 请输入待修改的客户编号：3
 * 请输入新的客户姓名：林小玲
 * 修改成功！
 */
public class Homework2 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("JDBC\\src\\homework\\homework.properties"));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "update customers set name = ? where id = ?";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input customer's name: ");
        String name = scanner.nextLine();
        System.out.print("Please input customer's id: ");
        String id = scanner.nextLine();

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, name);
        statement.setString(2, id);

        int update = statement.executeUpdate();

        System.out.println(update > 0 ? "finished" : "unfinished");

        scanner.close();
        statement.close();
        connection.close();

    }
}
