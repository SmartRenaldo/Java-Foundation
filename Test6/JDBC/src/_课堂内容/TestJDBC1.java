package _课堂内容;

import java.sql.SQLException;

/**
 * 此类用于演示JDBC的使用步骤1：加载驱动
 * @author Gavin
 * 类的加载时机：
 * 1》new 对象
 * 2》加载子类
 * 3》调用类中的静态成员
 * 4》通过反射
 * 使用new 对象的方式加载类的不足：
 * 1、属于编译期加载，如果编译期间该类不存在，则直接报编译错
 * 2、导致Driver对象创建了两遍，效率较低
 * 采用反射的方式加载类!
 * 1、属于运行期加载，大大降低了类的依赖性
 * 2、Driver对象仅仅创建了1遍，效率较高
 */
public class TestJDBC1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.旧方法
        //DriverManager.registerDriver(new Driver());

        //2.正确方法：反射
        Class.forName("com.mysql.jdbc.Driver");
    }
}
