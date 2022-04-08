package _课堂内容;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 此类用于演示JDBC的简单使用步骤
 *
 * @author liyuting
 * 步骤：
 * 前提：准备mysql的驱动包，加载到项目中
 * 复制mysql-connector-java-5.1.37-bin.jar到项目的根目录下或libs目录下，然后右击build path——add to build path
 * 1、加载驱动
 * 2、获取连接
 * 3、执行增删改查操作★
 * 4、关闭连接
 */
public class TestConnection {
    @BeforeEach
    public void init() throws SQLException, ClassNotFoundException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
    }

    @Test
    public void testDelete() throws SQLException {
        //2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/girls", "root", "123123");

        //3.执行增删改查
        //3-1.编写sql语句
        String sql = "delete from beauty where id = 9";

        //3-2.获取执行sql语句的命令对象
        Statement statement = connection.createStatement();

        //3-3.使用命令对象指向sql语句
        int update = statement.executeUpdate(sql);

        //3-4.处理执行结果
        System.out.println(update > 0 ? "success" : "failure");

        //4.关闭连接
        statement.close();
        connection.close();
    }

    @Test
    public void testInsert() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/girls", "root", "123123");

        String str = "insert into beauty values (null,'柳岩','女','1999-9-9','123423436',null,4)";

        Statement statement = connection.createStatement();

        int update = statement.executeUpdate(str);

        System.out.println(update > 0 ? "success" : "failure");

        statement.close();

        connection.close();
    }

    @Test
    public void testUpdate() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/girls", "root", "123123");

        String str = "update beauty set name='赵丽颖' where id = 5";

        Statement statement = connection.createStatement();

        int update = statement.executeUpdate(str);

        System.out.println(update);

        System.out.println(update > 0 ? "success" : "failure");

        statement.close();
        connection.close();
    }

}
