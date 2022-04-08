import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author Gavin
 */
public class JDBCUtils {
    private static final String DRIVER;
    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;

    static{
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\batch.properties"));

            DRIVER = properties.getProperty("driver");
            URL = properties.getProperty("url");
            USER = properties.getProperty("user");
            PASSWORD = properties.getProperty("password");

            Class.forName(DRIVER);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取可用的连接对象
     * @return 连接对象
     */
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 关闭资源
     * @param set
     * @param statement
     * @param connection
     */
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
