package homework04;

import java.io.*;

/**
 * 7.1． 训练知识点
 * 1. 对象的序列化
 * 7.2． 训练描述
 * 定义一个学生类，包含姓名，年龄，性别等成员变量，提供setters和getters方法以及构造方法。在测试类中创建一
 * 个学生对象，给学生对象的三个成员变量赋值。然后将该对象保存到当前项目根目录下的stu.txt文件中。
 * 7.3． 操作步骤描述
 * 1. 定义学生类并实现序列化接口和测试类
 * 2. 在测试类中创建学生对象
 * 3. 创建文件字节输出流对象并关联目标文件
 * 4. 根据文件字节输出流对象创建对象输出流对象
 * 5. 调用对象输出流对象的方法将学生对象保存到文件中
 * 6. 关闭流释放资源
 */
public class Demo01 {
    private static final String PATHNAME = "IO2\\src\\homework04\\stu.txt";

    public static void main(String[] args) {
        serialize();
        deserialize();
    }

    private static void serialize() {
        Student student01 = new Student("Catherine", 25, "female");
        Student student02 = new Student("Harry", 18, "male");
        Student student03 = new Student("Muhammad", 23, "male");
        try (final ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATHNAME));
        ) {
            oos.writeObject(student01);
            oos.writeObject(student02);
            oos.writeObject(student03);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deserialize() {
        try (final ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATHNAME));
        ) {
            Student student01 = (Student) ois.readObject();
            Student student02 = (Student) ois.readObject();
            Student student03 = (Student) ois.readObject();
            System.out.println(student01);
            System.out.println(student02);
            System.out.println(student03);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
