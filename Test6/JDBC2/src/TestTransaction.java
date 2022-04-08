import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestTransaction {
    @Test
    public void testNoTransaction() {
        Connection connection = JDBCUtils.getConnection();
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("update account set balance = ? where id = ?");
            statement.setDouble(1, 5000);
            statement.setInt(2, 1);
            statement.executeUpdate();

            int i = 1 / 0;

            statement.setDouble(1, 15000);
            statement.setInt(2, 2);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(null, statement, connection);
        }
    }

    @Test
    public void testTransaction() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        PreparedStatement statement = null;

        try {
            //①事务的使用步骤1：开启事务
            connection.setAutoCommit(false);

            //②事务的使用步骤2：编写sql语句，并且执行
            statement = connection.prepareStatement("update account set balance = ? where id = ?");

            statement.setDouble(1, 5000);
            statement.setInt(2, 1);
            statement.executeUpdate();

            //更新要么一起成功，要么一起失败
            //int i = 1 / 0;

            statement.setDouble(1, 15000);
            statement.setInt(2, 2);
            statement.executeUpdate();

            //③事务的使用步骤3：结束事务
            connection.commit();
        } catch (SQLException throwables) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } finally {
            JDBCUtils.close(null, statement, connection);
        }
    }
}
