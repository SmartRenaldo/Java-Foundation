package _测试题;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * 显示表my_employees的结构
 *
 * @author Gavin
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        Properties info = new Properties();
        info.load(new FileInputStream("JDBC\\src\\_测试题\\jdbc.properties"));

        String driver = info.getProperty("driver");
        String url = info.getProperty("url");
        String user = info.getProperty("user");
        String password = info.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "desc my_employees";

        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet set = statement.executeQuery(sql);

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "Field", "Type", "Null", "Key", "Default", "Extra");

        while (set.next()) {
/*            Object field = set.getObject(1);
            Object type = set.getObject(2);
            Object _null = set.getObject(3);
            Object key = set.getObject(4);
            Object _default = set.getObject(5);
            Object extra = set.getObject(6);*/

            String field = set.getString(1);
            String type = set.getString(2);
            String _null = set.getString(3);
            String key = set.getString(4);
            String _default = set.getString(5);
            String extra = set.getString(6);
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", field, type, _null, key, _default, extra);
        }

        set.close();
        statement.close();
        connection.close();
    }
}
