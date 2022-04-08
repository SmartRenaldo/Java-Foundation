package homework07;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 11.1． 训练知识点
 * 1. 对象的序列化,对象输出流的使用
 * 11.2． 训练描述
 * 定义一个学生类，成员变量有姓名，年龄，性别，提供setters和getters方法以及构造方法
 * 定义一个测试类，在测试类创建多个学生对象保存到集合中，然后将集合存储到当前项目根目录下的stus.txt文件
 * 中。
 * 11.3． 操作步骤描述
 * 1. 创建集合对象用来存放学生
 * 2. 创建多个学生对象添加到集合中
 * 3. 创建对象输出流关联目标文件
 * 4. 调用对象输出流的方法将集合对象保存到文件中
 * 5. 关闭流并释放资源
 */
public class Demo01 {
    private static final String PATHNAME = "IO2\\src\\homework07\\stus.txt";
    private static final ArrayList<Student> STUDENTS = new ArrayList<>();

    static {
        Student student01 = new Student("Tiffany", 18, "female");
        Student student02 = new Student("Lucas", 17, "male");
        Student student03 = new Student("Alice", 27, "female");
        Collections.addAll(STUDENTS, student01, student02, student03);
    }

    public static void main(String[] args) {
        serialize();
        deserialize();
    }

    private static void serialize() {
        try (final ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATHNAME))
        ) {
            oos.writeObject(STUDENTS);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static void deserialize() {
        try (final ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATHNAME))
        ) {
            ArrayList<homework07.Student> students = (ArrayList<Student>) ois.readObject();
            students.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
