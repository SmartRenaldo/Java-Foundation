import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

public class TestDBUtils2 {
    /**
     * 二、修改指定客户
     * 请输入待修改的客户生日：1999-09-09
     * 请输入新的客户id：5
     * 修改成功！
     */
    @Test
    public void testUpdate() {
        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            QueryRunner qr = new QueryRunner();
            int update = qr.update(connection, "update customers set birth = ? where id = ?",
                    "1999-09-09", 5);
            System.out.println(update > 0 ? "success" : "failed");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    /**
     * 向customers表中插入数据，效果如下：
     * 请输入编号：18
     * 请输入姓名：理查德
     * 请输入邮箱：richard@126.com
     * 请输入生日（要求按xxxx-xx-xx格式）：1988-12-08
     * 插入成功！
     */
    @Test
    public void testInsert() {
        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            QueryRunner qr = new QueryRunner();
            //"insert into customers values (55,'上官红','shangguan@126.com','1988-11-11',null)"
            int update = qr.update(connection, "insert into customers values (?,?,?,?,?)", 18, "理查德", "richard@126.com", "1988-12-08", null);
            System.out.println(update > 0 ? "success" : "failed");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    //查询所有客户信息
    @Test
    public void testQuery() {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            QueryRunner qr = new QueryRunner();
            List<Customers> list = qr.query(connection, "select * from customers where id > ?",
                    new BeanListHandler<>(Customers.class), 5);
            list.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    /**
     * 根据姓名，查询客户的详细信息，效果如下：
     * 请输入姓名：王菲
     * ---------------------------------------------------------------------------------
     * 查无此人
     */
    @Test
    public void testQuerySingle(){
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            QueryRunner qr = new QueryRunner();
            Customers customer = qr.query(connection, "select * from customers where id = ?", new BeanHandler<>(Customers.class), 4);
            System.out.println(customer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }
}
