import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 此类用于封装通用的增删改查方法
 *
 * @author Gavin
 * 功能：
 * 1、执行增删改
 * 2、执行查询
 */
public class CRUDUtils {
    /**
     * 功能：增删改
     *
     * @param sql
     * @param params
     * @return
     */
    @Test
    public static int update(String sql, Object... params) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            statement = connection.prepareStatement(sql);

            for (int i = 0; i < params.length; i++) {
                statement.setObject(i + 1, params[i]);
            }

            return statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, statement, connection);
        }
    }

    /**
     * 只针对boys表，单行查询
     *
     * @param sql
     * @param params
     * @return
     */
    @Test
    public static Boys querySingle(String sql, Object... params) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet set = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            statement = connection.prepareStatement(sql);

            for (int i = 0; i < params.length; i++) {
                statement.setObject(i + 1, params[i]);
            }

            set = statement.executeQuery();

            if (set.next()) {
                int id = set.getInt("id");
                String boyName = set.getString("boyName");
                int userCP = set.getInt("userCP");

                return new Boys(id, boyName, userCP);
            }

            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(set, statement, connection);
        }
    }

    /**
     * 只针对boys表，多行查询
     *
     * @param sql
     * @param params
     * @return
     */
    @Test
    public static List<Boys> queryMulti(String sql, Object... params) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet set = null;
        List<Boys> boys = new ArrayList<>();

        try {
            connection = JDBCUtilsByDruid.getConnection();
            statement = connection.prepareStatement(sql);

            for (int i = 0; i < params.length; i++) {
                statement.setObject(i + 1, params[i]);
            }

            set = statement.executeQuery();

            while (set.next()) {
                int id = set.getInt("id");
                String boyName = set.getString("boyName");
                int userCP = set.getInt("userCP");
                boys.add(new Boys(id, boyName, userCP));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByDruid.close(set, statement, connection);
        }

        return boys;
    }
}
