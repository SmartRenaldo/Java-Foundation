package homework03;

import java.io.*;

/**
 * 6.1． 训练知识点
 * 1. 转换输入流的使用
 * 6.2． 训练描述
 * 利用转换输入流将当前项目根目录下使用gbk编码的a.txt文件的内容读取出来，并打印在控制台上。
 * 要求：不能出现乱码的情况。
 * 6.3． 操作步骤描述
 * 1. 创建字节输入流对象指定文件路径。
 * 2. 根据字节输入流对象创建转换输入流对象并指定字符集编码为：gbk
 * 3. 调用转换输入流对象的读取方法读取内容
 * 4. 关闭流释放资源
 */
public class Demo02 {
    private static final String FILEPATH = "IO2\\src\\homework03\\a.txt";

    public static void main(String[] args) {
        try (final InputStreamReader isr =
                     new InputStreamReader(new FileInputStream(FILEPATH), "GBK");
        ) {
            int len;
            char[] buffer = new char[3];
            while ((len = isr.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
