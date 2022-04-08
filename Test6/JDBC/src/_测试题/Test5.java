package _测试题;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * 将3号员工的last_name修改为“drelxer”
 *
 * @author Gavin
 */
public class Test5 {
    public static void main(String[] args) throws Exception {
        Properties info = new Properties();
        info.load(new FileInputStream("JDBC\\src\\_测试题\\jdbc.properties"));

        String driver = info.getProperty("driver");
        String url = info.getProperty("url");
        String user = info.getProperty("user");
        String password = info.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        //update `runoob_tbl` set `submission_date`='2016-05-06' where `runoob_id`=3;
        String sql = "update my_employees set last_name='drelxer' where id=3";

        PreparedStatement statement = connection.prepareStatement(sql);

        int update = statement.executeUpdate();

        System.out.println(update > 0 ? (update > 1 ? update + " lines updated" : "1 line updated") : "failed");

        statement.close();
        connection.close();
    }
}
