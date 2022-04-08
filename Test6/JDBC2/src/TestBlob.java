import org.junit.Test;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 此类用于演示Blob类型数据的存取
 * 相关API：
 * <p>
 * setBlob(占位符索引，InputStream对象)
 * getBlob(列索引或列名)
 * getBinaryStream(列索引或列名)
 *
 * @author Gavin
 */
public class TestBlob {
    @Test
    public void testSave() {
        Connection connection = JDBCUtils.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("update beauty set photo = ? where id = 1");
            statement.setBlob(1, new BufferedInputStream(new FileInputStream("D:\\audrey-hepburn.jpg")));
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, statement, connection);
        }
    }

    @Test
    public void testRead() {
        Connection connection = JDBCUtils.getConnection();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        PreparedStatement statement = null;
        ResultSet set = null;

        try {
            statement = connection.prepareStatement("select photo from beauty where id = 1");
            set = statement.executeQuery();

            if (set.next()) {
                bis = new BufferedInputStream(set.getBinaryStream("photo"));
                bos = new BufferedOutputStream(new FileOutputStream("src\\beauty.jpg"));

                byte[] buffer = new byte[1024];
                int len;

                while ((len = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, len);
                }
            }
            bis.close();
            bos.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(set, statement, connection);
        }
    }
}
