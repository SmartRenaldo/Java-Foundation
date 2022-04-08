import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJDBCUtils {
    /**
     * 修改指定客户
     * 请输入待修改的客户编号：3
     * 请输入新的客户姓名：林小玲
     * 修改成功！
     */
    @Test
    public void test() {
        Connection connection = JDBCUtils.getConnection();

        String sql = "update customers set name=? where id=?";

        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, "王晓华");
            statement.setInt(2, 7);

            int update = statement.executeUpdate();

            System.out.println(update > 0 ? "success" : "failed");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(null, statement, connection);
        }
    }
}
