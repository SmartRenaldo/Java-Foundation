package _25字节流的使用;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 目标：字节输出流的使用。
 * <p>
 * IO流的体系：
 * 字节流                                      字符流
 * 字节输入流            字节输出流               字符输入流       字符输出流
 * InputStream         OutputStream           Reader         Writer     (抽象类)
 * FileInputStream     FileOutputStream       FileReader     FileWriter (实现类)
 * <p>
 * a.FileOutputStream文件字节输出流
 * -- 作用：以内存为基准，把内存中的数据，按照字节的形式写出到磁盘文件中去。
 * 简单来说，把内存数据按照字节写出到磁盘文件中去。
 * -- 构造器：
 * public FileOutputStream(File file):创建一个字节输出流管道通向目标文件对象。
 * public FileOutputStream(String file):创建一个字节输出流管道通向目标文件路径。
 * public FileOutputStream(File file , boolean append):创建一个追加数据的字节输出流管道通向目标文件对象。
 * public FileOutputStream(String file , boolean append):创建一个追加数据的字节输出流管道通向目标文件路径。
 * -- 方法：
 * public void write(int a):写一个字节出去 。
 * public void write(byte[] buffer):写一个字节数组出去。
 * public void write(byte[] buffer , int pos , int len):写一个字节数组的一部分出去。
 * 参数一，字节数组；参数二：起始字节索引位置，参数三：写多少个字节数出去。
 * 小结：
 * 字节输出流只能写字节出去。
 * 字节输出流默认是覆盖数据管道。
 * 换行用： os.write("\r\n".getBytes());
 * 关闭和刷新：刷新流可以继续使用，关闭包含刷新数据但是流就不能使用了！
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("IO\\src\\_25字节流的使用\\dlei03.txt");
        outputStream.write(97);
        outputStream.write('b');
        outputStream.write(105);
        //outputStream.write('张');    //只会写出中文的第一个字节, 会乱码
        //换行: “\r\n”比“\n”兼容性更高
        outputStream.write("\r\n".getBytes());
        //刷新流，close()方法自动包括刷新
        //outputStream.flush();

        byte[] bytes01 = new byte[]{33, 'e', 48, 57, 58, 59};
        outputStream.write(bytes01);
        outputStream.write("\r\n".getBytes());

        //便捷写法
        byte[] bytes02 = "Java是最优美的语言".getBytes();
        outputStream.write(bytes02);
        outputStream.write("\r\n".getBytes());

        byte[] bytes03 = "Java是最优美的语言".getBytes();
        //public void write(byte[] buffer , int pos , int len):写一个字节数组的一部分出去。
        //参数一，字节数组；参数二：起始字节索引位置，参数三：写多少个字节数出去。
        outputStream.write(bytes03, 0, 19);
        outputStream.write("\r\n".getBytes());

        //关闭流
        outputStream.close();
    }
}
