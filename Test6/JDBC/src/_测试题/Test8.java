package _测试题;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 删除所有数据
 *
 * @author Gavin
 */
public class Test8 {
    public static void main(String[] args) throws Exception {
        Properties info = new Properties();
        info.load(new FileInputStream("JDBC\\src\\_测试题\\jdbc.properties"));

        String driver = info.getProperty("driver");
        String url = info.getProperty("url");
        String user = info.getProperty("user");
        String password = info.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        queryTableUsers(connection, "initial table");
        queryTableMy_employees(connection, "initial table");

        String sql = "delete users,my_employees from users join my_employees";

        PreparedStatement statement = connection.prepareStatement(sql);

        int update = statement.executeUpdate();

        System.out.println(update > 0 ? (update > 1 ? update + " lines updated" : "1 line updated") : "failed");

        queryTableUsers(connection, "updated table");
        queryTableMy_employees(connection, "updated table");

        connection.close();
    }

    private static void queryTableUsers(Connection connection, String title) throws SQLException {
        String sqlQueryTable = "select * from users";

        PreparedStatement tableStatement = connection.prepareStatement(sqlQueryTable);

        System.out.println(title + "(users)");
        System.out.printf("%-15s%-15s%-15s\n", "Id", "Userid", "Department_id");

        ResultSet tableSet = tableStatement.executeQuery();

        while (tableSet.next()) {
            int id = tableSet.getInt(1);
            String userid = tableSet.getString(2);
            int department_id = tableSet.getInt(3);

            System.out.printf("%-15d%-15s%-15d\n", id, userid, department_id);
        }

        System.out.println();

        tableStatement.close();
    }

    private static void queryTableMy_employees(Connection connection, String title) throws SQLException {
        String sqlQueryTable = "select * from my_employees";

        PreparedStatement tableStatement = connection.prepareStatement(sqlQueryTable);

        System.out.println(title + "(my_employees)");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Id", "First_name", "Last_name", "Userid", "Salary");

        ResultSet tableSet = tableStatement.executeQuery();

        while (tableSet.next()) {
            int id = tableSet.getInt(1);
            String first_name = tableSet.getString(2);
            String last_name = tableSet.getString(3);
            String userid = tableSet.getString(4);
            double salary = tableSet.getDouble(5);

            System.out.printf("%-15d%-15s%-15s%-15s%-15.2f\n", id, first_name, last_name, userid, salary);
        }

        System.out.println();

        tableStatement.close();
    }

}
