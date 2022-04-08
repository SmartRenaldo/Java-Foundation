package homework03;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 5.1． 训练知识点
 * 1. 转换输出流的使用
 * 5.2． 训练描述
 * 现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。
 * 要求：使用gbk编码保存。
 * 注意：idea的默认编码是utf-8，所以可以通过file->settings->file encodings设置为gbk格式，否则打开a.txt文件看
 * 到的将会是乱码。
 * 5.3． 操作步骤描述
 * 1. 创建文件字节输出流关联目标文件
 * 2. 根据文件字节输出流创建转换输出流对象，并指定编码字符集为：gbk
 * 3. 调用流对象的方法将字符串写出到文件中。
 * 4. 关闭流并释放资源。
 */
public class Demo01 {
    private static final String FILEPATH = "IO2\\src\\homework03\\a.txt";

    public static void main(String[] args) {
        try (final OutputStreamWriter osw =
                     new OutputStreamWriter(new FileOutputStream(FILEPATH), "GBK");
        ) {
            osw.write("我爱Java");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
