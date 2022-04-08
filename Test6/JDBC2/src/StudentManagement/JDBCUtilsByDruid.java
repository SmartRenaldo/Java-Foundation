package StudentManagement;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 此类是通过德鲁伊数据库连接池获取连接对象
 *
 * @author Gavin
 */
public class JDBCUtilsByDruid {
    private static DataSource ds;

    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("JDBC2\\src\\StudentManagement\\druid.properties"));

            //1.创建了一个指定参数的数据库连接池
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception {
        //2.从数据库连接池中获取可用的连接对象
        return ds.getConnection();
    }

    public static void close(ResultSet set, Statement statement, Connection connection){
        try {
            if (set!=null){
                set.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (connection!=null){
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
