package _07序列化;

import java.io.*;

/**
 * 目标:对象序反列化技术。
 * <p>
 * 序列化：就是把Java对象数据直接存储到文件中去。           对象 => 文件中
 * 反序列化：把Java对象的文件数据恢复到Java对象中。         文件中 => 对象
 * <p>
 * 字节流                                   字符流
 * 字节输入流               字节输出流              字符输入流          字符输出流
 * InputStream             OutputStream          Reader             Writer   (抽象类)
 * FileInputStream         FileOutputStream      FileReader         FileWriter(实现类)
 * BufferedInputStream     BufferedOutputStream  BufferedReader     BufferedWriter(实现类，缓冲流)
 * InputStreamReader       OutputStreamWriter
 * ObjectInputStream       ObjectOutputStream
 * <p>
 * 对象反序列化（对象字节输入流）：ObjectInputStream
 * -- 作用：读取序列化的对象文件恢复到Java对象中。
 * -- 构造器：public ObjectInputStream(InputStream is)
 * -- 方法：public final Object readObject()
 * <p>
 * 如果一个字段不想参数序列化：
 * transient修饰该成员变量，它将不参与序列化！
 * 序列化版本号：
 * // 加入序列版本号
 * private static final long serialVersionUID = 2L;
 * 必须序列化使用的版本号和反序列化使用的版本号一致才可以正常反序列化！否则报错！
 * 小结：
 * 对象反序列化可以把对象序列化的文件数据恢复成Java对象。
 * 对象反序列化使用的流是：ObjectInputStream.
 */
public class SerializeDemo02 {
    public static void main(String[] args) {
        try (
                // 1.定义一个低级的字节输入流通向源文件
                final InputStream is = new FileInputStream("IO2\\src\\_07序列化\\dlei01.dat");
                // 2.把字节输入流包装成高的对象字节输入流
                final ObjectInputStream ois = new ObjectInputStream(is);
        ) {
            // 3.反序列化
            User user = (User) ois.readObject();
            System.out.println(user);
            System.out.println("Deserialization succeeded");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
