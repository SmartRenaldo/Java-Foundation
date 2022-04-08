package _25字节流的使用;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 目标：字节输出流的使用-追加数据管道。
 * <p>
 * IO流的体系：
 * 字节流                                   字符流
 * 字节输入流           字节输出流               字符输入流       字符输出流
 * InputStream         OutputStream           Reader         Writer     (抽象类)
 * FileInputStream     FileOutputStream       FileReader     FileWriter (实现类)
 * <p>
 * FileOutputStream字节输出流每次启动写数据的时候都会先清空之前的全部数据，从新写入。
 * 小结：
 * 覆盖数据管道： OutputStream os = new FileOutputStream("Day09Demo/out05");
 * 追加数据管道：OutputStream os = new FileOutputStream("Day09Demo/out05" , true);
 * 参数二代表了此管道是追加数据的管道，不会覆盖之前的数据！
 */
public class FileOutputStreamDemo02 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("IO/src/_25字节流的使用/dlei03.txt", true);
            os.write('a');
            os.write("\r\n".getBytes());
            byte[] buffer = "Java是最优美的语言".getBytes();
            os.write(buffer, 1, 8);
            os.write("\r\n".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
