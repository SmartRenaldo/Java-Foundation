package _测试题;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 将所有工资少于900的员工的工资修改为1000
 *
 * @author Gavin
 */
public class Test6 {
    public static void main(String[] args) throws Exception {
        Properties info = new Properties();
        info.load(new FileInputStream("JDBC\\src\\_测试题\\jdbc.properties"));

        String driver = info.getProperty("driver");
        String url = info.getProperty("url");
        String user = info.getProperty("user");
        String password = info.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        queryTable(connection, "Initial table");

        System.out.println();

        String sql = "update my_employees set salary = 1000 where salary < 900";

        PreparedStatement statement = connection.prepareStatement(sql);
        int update = statement.executeUpdate();

        System.out.println(update > 0 ? update + " lines updated" : "failed");

        System.out.println();

        queryTable(connection, "updated table");

        statement.close();
        connection.close();
    }

    private static void queryTable(Connection connection, String title) throws SQLException {
        String sqlQueryTable = "select * from my_employees";

        PreparedStatement tableStatement = connection.prepareStatement(sqlQueryTable);
        ResultSet tableSet = tableStatement.executeQuery();

        System.out.println(title);
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Id", "First_name", "Last_name", "Userid", "Salary");

        while (tableSet.next()) {
            int id = tableSet.getInt(1);
            String first_name = tableSet.getString(2);
            String last_name = tableSet.getString(3);
            String userid = tableSet.getString(4);
            double salary = tableSet.getDouble(5);

            System.out.printf("%-15d%-15s%-15s%-15s%-15.2f\n", id, first_name, last_name, userid, salary);
        }
    }
}
