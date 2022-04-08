package _课堂内容;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author Gavin
 * <p>
 * 此类用于演示PreparedStatement和Statement的区别
 * @author liyuting
 * 案例：登录验证
 * 使用PreparedStatement的好处：
 * 1、不再使用+拼接sql语句，减少语法错误，语义性强
 * 2、将模板sql（固定的部分）和参数部分进行了分离，提高维护性
 * 3、有效的解决了sql注入问题！
 * 4、大大减少了编译次数，效率较高
 *
 * 注：占位符只能替换值类型，不能替换表明、字段名或其他关键词
 */
public class TestPrepareStatement {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("JDBC\\src\\_课堂内容\\jdbc.properties"));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input username: ");
        String CliUser = scanner.nextLine();
        System.out.print("Please input password: ");
        String CliPassword = scanner.nextLine();

        //1.注册驱动
        Class.forName(driver);

        //2.获取连接
        Connection connection = DriverManager.getConnection(url, user, password);

        //3.执行查询
        //3-1 编写sql
        String sql = "select count(*) from admin where username = ? and password = ?";

        //3-1 获取PreparedStatement命令对象
        PreparedStatement statement = connection.prepareStatement(sql);

        //预编译
        //3-2 设置占位符的值
        statement.setString(1, CliUser);
        statement.setString(2, CliPassword);

        //3-3 执行sql命令
        //int update = statement.executeUpdate();//执行增删改，返回受影响的行数
        ResultSet set = statement.executeQuery();

        if (set.next()) {
            int count = set.getInt(1);
            System.out.println(count > 0 ? "Logged in" : "Login failed");
        }

        scanner.close();
        set.close();
        statement.close();
        connection.close();
    }
}
