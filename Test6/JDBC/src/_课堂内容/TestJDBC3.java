package _课堂内容;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 此类用于演示JDBC的使用步骤3：增删改查
 *
 * @author Gavin
 */
public class TestJDBC3 {
    public static void main(String[] args) throws Exception {
        Properties info = new Properties();
        info.load(new FileInputStream("JDBC\\src\\_课堂内容\\jdbc.properties"));
        String driver = info.getProperty("driver");
        String url = info.getProperty("url");
        String user = info.getProperty("user");
        String password = info.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("connected");

        String sql = "select id, name, sex, borndate from beauty";

        Statement statement = connection.createStatement();

        //执行增删改语句，返回受影响的行数
        //int update = statement.executeUpdate(sql);

        //执行任意sql语句
        //boolean flag = statement.execute(sql);

        //执行查询语句，返回查询结果集
        ResultSet set = statement.executeQuery(sql);

        while (set.next()) {
            int id = set.getInt(1);
            String name = set.getString(2);
            String sex = set.getString(3);
            Date date = set.getDate(4);

            //System.out.println(id + "\t" + name + "\t" + sex + "\t" + date + "\t");

            System.out.printf("%-15s%-15s%-15s%-15s\n", id, name, sex, date);
        }

        //关闭连接
        set.close();
        statement.close();
        connection.close();
    }
}
