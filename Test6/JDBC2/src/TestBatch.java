import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

/**
 * 此类用于演示批处理的使用
 * <p>
 * 案例：向admin表中插入50000行数据
 * 相关API：
 * addBatch
 * executeBatch
 * clearBatch
 * <p>
 * 说明：批处理往往和PreparedStatement一起搭配使用，可以既减少编译次数，又减少运行次数，效率大大提高
 * 追加url：?rewriteBatchedStatements=true
 *
 * @author Gavin
 */
public class TestBatch {
    @Test
    public void testWithoutBatch() {
        Connection connection = JDBCUtils.getConnection();
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("insert into admin values(null,?,?)");

            for (int i = 0; i < 50000; i++) {
                statement.setString(1, UUID.randomUUID().toString().substring(0, 4));
                statement.setInt(2, UUID.randomUUID().toString().substring(0, 4).hashCode());

                statement.executeUpdate();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(null, statement, connection);
        }
    }

    @Test
    public void testBatch() {
        Connection connection = JDBCUtils.getConnection();
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("insert into admin values(null,?,?)");

            for (int i = 1; i <= 50000; i++) {
                statement.setString(1, UUID.randomUUID().toString().substring(0, 4));
                statement.setInt(2, UUID.randomUUID().toString().substring(0, 4).hashCode());

                statement.addBatch();

                if (i % 1000 == 0) {
                    statement.executeBatch();
                    statement.clearBatch();
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(null, statement, connection);
        }
    }
}
