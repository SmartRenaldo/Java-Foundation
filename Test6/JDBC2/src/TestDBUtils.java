import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

/**
 * 此类用于演示DBUtils的使用
 *
 * @author Gavin
 * 功能：封装了和数据库存取相关的一些方法
 * 通用的增删改查等等
 * <p>
 * QueryRunner类：
 * update(connection，sql，params):执行任何增删改语句
 * query(connection,sql,ResultSetHandler,params)：执行任何查询语句
 * ResultSetHandler接口
 * BeanHandler:将结果集的第一行，封装成对象，并返回                     new BeanHandler<>(XX.class)
 * BeanListHandler:将结果集中的所有行，封装成对象的集合，并返回        new BeanListHandler<>(XX.class)
 * ScalarHandler:将结果集中的第一行第一列，以Object形式返回   new ScalarHandler()
 * <p>
 * <p>
 * 使用步骤：
 * <p>
 * 1、导入jar包commons-dbutils-1.3.jar
 * 2、看帮助
 * 3、使用
 */
public class TestDBUtils {
    @Test
    public void testUpdate() {
        Connection connection = null;

        try {
            //1.获取连接
            connection = JDBCUtilsByDruid.getConnection();

            //2.执行增删改
            QueryRunner qr = new QueryRunner();
            //update方法会自动关闭statement()
            int update = qr.update(connection, "update boys set boyname = ? where id = 3", "林彪");

            System.out.println(update > 0 ? "success" : "failed");

            int update2 = qr.update(connection, "insert into admin values (?,?,?)",
                    null, "胡汉三", "12r4");
            System.out.println(update2 > 0 ? "success" : "failure");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //3.关闭连接
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    @Test
    public void testQuerySingle() {
        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();

            QueryRunner qr = new QueryRunner();

            Boys boys = qr.query(connection, "select * from boys where id = ?",
                    new BeanHandler<>(Boys.class), 2);

            System.out.println(boys);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    @Test
    public void testQueryMulti() {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            QueryRunner qr = new QueryRunner();

            List<Boys> list = qr.query(connection, "select * from boys where id > ?", new BeanListHandler<>(Boys.class), 2);

            list.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    @Test
    public void testScalar() {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            QueryRunner qr = new QueryRunner();
            Object query = qr.query(connection, "select * from admin", new ScalarHandler());
            System.out.println(query);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }
}
