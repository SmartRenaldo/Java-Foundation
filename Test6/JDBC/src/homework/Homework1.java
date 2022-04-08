package homework;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * 一、向customers表中插入数据，效果如下：
 * 请输入编号：55
 * 请输入姓名：上官红
 * 请输入邮箱：shangguan@126.com
 * 请输入生日（要求按xxxx-xx-xx格式）：1988-11-11
 * 插入成功！
 */
public class Homework1 {
    @Test
    public void testInsert() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\homework\\homework.properties"));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "insert into customers values (55,'上官红','shangguan@126.com','1988-11-11',null)";

        PreparedStatement statement = connection.prepareStatement(sql);

        int update = statement.executeUpdate();

        System.out.println(update > 0 ? (update > 1 ? update + " lines updated" : "1 line updated") : "failed");
    }
}
