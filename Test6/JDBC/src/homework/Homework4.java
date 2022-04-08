package homework;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * 四、根据姓名，查询客户的详细信息，效果如下：
 * 请输入姓名：王菲
 * ---------------------------------------------------------------------------------
 * 查无此人
 *
 * @author Gavin
 */
public class Homework4 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("JDBC\\src\\homework\\homework.properties"));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from customers where name = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name: ");
        String nameInput = scanner.nextLine();

        statement.setString(1, nameInput);
        ResultSet set = statement.executeQuery();


        if (set.next()) {
            System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "id", "name", "email", "birth", "photo");
            int id = set.getInt(1);
            String name = set.getString(2);
            String email = set.getString(3);
            Date birth = set.getDate(4);
            Blob photo = set.getBlob(5);
            System.out.printf("%-15d%-15s%-15s%-15s%-15s\n", id, name, email, birth, photo);
        } else {
            System.out.println("Not found");
        }

        set.close();
        statement.close();
        connection.close();
    }
}
