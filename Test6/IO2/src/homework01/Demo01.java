package homework01;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 1.1． 训练知识点
 * 1. 高效字节输出流写出字节数据
 * 1.2． 训练描述
 * 利用高效字节输出流往IO2\src\homework01\a.txt文件输出一个字节数。
 * 1.3． 操作步骤描述
 * 1. 创建字节输出流对象关联文件路径
 * 2. 利用字节输出流对象创建高效字节输出流对象
 * 3. 调用高效字节输出流对象的write方法写出一个字节
 * 4. 关闭高效流，释放资源。
 */
public class Demo01 {
    private static final String PATHNAME = "IO2\\src\\homework01\\a.txt";
    public static void main(String[] args) {
        try (final BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(PATHNAME));
        ) {
            bos.write(97);
            bos.write('b');
            bos.write("\r\n".getBytes());
            bos.write("i love java".getBytes());
            bos.write("\r\n".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
