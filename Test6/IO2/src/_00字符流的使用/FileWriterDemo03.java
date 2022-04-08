package _00字符流的使用;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

/**
 * 目标：字符输出流的使用。
 * <p>
 * IO流的体系：
 * 字节流                                      字符流
 * 字节输入流            字节输出流               字符输入流       字符输出流
 * InputStream         OutputStream           Reader         Writer     (抽象类)
 * FileInputStream     FileOutputStream       FileReader     FileWriter (实现类)
 * <p>
 * d.FileWriter文件字符输出流的使用。
 * -- 作用：以内存为基准，把内存中的数据按照字符的形式写出到磁盘文件中去。
 * 简单来说，就是把内存的数据以字符写出到文件中去。
 * -- 构造器：
 * public FileWriter(File file):创建一个字符输出流管道通向目标文件对象。
 * public FileWriter(String filePath):创建一个字符输出流管道通向目标文件路径。
 * public FileWriter(File file,boolean append):创建一个追加数据的字符输出流管道通向目标文件对象。
 * public FileWriter(String filePath,boolean append):创建一个追加数据的字符输出流管道通向目标文件路径。
 * -- 方法：
 * a.public void write(int c):写一个字符出去
 * b.public void write(String c)写一个字符串出去：
 * c.public void write(char[] buffer):写一个字符数组出去
 * d.public void write(String c ,int pos ,int len):写字符串的一部分出去
 * e.public void write(char[] buffer ,int pos ,int len):写字符数组的一部分出去
 * 小结：
 * 字符输出流可以写字符数据出去，总共有5个方法写字符。
 * 覆盖管道：
 * Writer fw = new FileWriter("Day10Demo/src/dlei03.txt"); // 覆盖数据管道
 * 追加数据管道：
 * Writer fw = new FileWriter("Day10Demo/src/dlei03.txt",true); // 追加数据管道
 * 换行：
 * fw.write("\r\n"); // 换行
 * 读写字符文件数据建议使用字符流。
 */
public class FileWriterDemo03 {
    public static void main(String[] args) throws Exception {
        // 追加数据管道
        //Writer fw = new FileWriter("IO2/src/_00字符流的使用/dlei03", true);
        // 覆盖数据管道
        Writer fw = new FileWriter("IO2/src/_00字符流的使用/dlei03");
        //public void write(int c): 写一个字符出去
        fw.write(97);
        fw.write('b');
        fw.write('汉');
        fw.write("\r\n");

        //public void write(String c): 写一个字符串出去
        fw.write("我爱JAVA\r\n");
        fw.write("JAVA是最优美的语言\r\n");

        //public void write(char[] buffer): 写一个字符数组出去
        fw.write("我爱JAVA\r\n".toCharArray());
        System.out.println(Arrays.toString("\r\n".getBytes()));

        //public void write(String c ,int pos ,int len): 写字符串的一部分出去
        fw.write("JAVA是最优美的语言", 0, 9);
        fw.write("\r\n");
        fw.write("JAVA是最优美的语言", 1, 9);
        fw.write("\r\n");

        //public void write(char[] buffer ,int pos ,int len): 写字符数组的一部分出去
        fw.write("我爱JAVA, JAVA爱我".toCharArray(), 0, 9);
        fw.write("\r\n".toCharArray());
        fw.write("我爱JAVA, JAVA爱我".toCharArray(), 1, 9);
        fw.write("\r\n".toCharArray());

        fw.close();

        System.out.println("写入成功");
    }
}
