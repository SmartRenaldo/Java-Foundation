package homework;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 三、查询所有客户信息
 *
 * @author Gavin
 */
public class Homework3 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("JDBC\\src\\homework\\homework.properties"));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from customers";

        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet set = statement.executeQuery();

        if (!set.next()) {
            System.out.println("Not found");
        } else {
            set.previous();

            System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "id", "name", "email", "birth", "photo");

            while (set.next()) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String email = set.getString("email");
                Date birth = set.getDate("birth");
                Blob photo = set.getBlob("photo");
                System.out.printf("%-15d%-15s%-15s%-15s%-15s\n", id, name, email, birth, photo);
            }

            set.close();
            statement.close();
            connection.close();
        }
    }
}
