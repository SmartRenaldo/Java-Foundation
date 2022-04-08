package StudentManagement;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class BasicDAO<T> {
    private QueryRunner qr = new QueryRunner();

    /**
     * general method of adding, deleting and modifying
     *
     * @param sql
     * @param params
     * @return number of lines
     */
    public int update(String sql, Object... params) {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();

            return qr.update(connection, sql, params);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    public T querySingle(String sql, Class<T> clazz, Object... prarms) {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanHandler<>(clazz), prarms);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    public List<T> queryMulti(String sql, Class<T> clazz, Object... params) {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanListHandler<>(clazz), params);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    public Object scalar(String sql, Object... params) {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new ScalarHandler(), params);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }
}
