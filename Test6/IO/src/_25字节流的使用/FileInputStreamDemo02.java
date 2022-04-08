package _25字节流的使用;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 目标：字节输入流的使用-按照字节数组读取。
 * <p>
 * IO流的体系：
 * 字节流                                      字符流
 * 字节输入流            字节输出流               字符输入流       字符输出流
 * InputStream         OutputStream           Reader         Writer     (抽象类)
 * FileInputStream     FileOutputStream       FileReader     FileWriter (实现类)
 * <p>
 * a.FileInputStream文件字节输入流。
 * -- 作用：以内存为基准，把磁盘文件中的数据按照字节的形式读入到内存中的流。
 * 简单来说，就是按照字节读取文件数据到内存。
 * -- 构造器：
 * 1.public FileInputStream(File path):创建一个字节输入流管道与源文件对象接通。
 * 2.public FileInputStream(String pathName):创建一个字节输入流管道与文件路径对接。
 * -- 方法：
 * 1.public int read():每次读取一个字节返回！读取完毕会返回-1。
 * 2.public int read(byte[] buffer):从字节输入流中读取字节到字节数组中去，
 * 返回读取的字节数量，没有字节可读返回-1。
 * 小结：
 * public int read(byte[] buffer):从字节输入流中读取字节到字节数组中去，
 * 返回读取的字节数量，没有字节可读返回-1。
 * 使用字节数组读取内容，效率可以。
 * 但是使用字节数组读取文本内容输出，也无法避免中文读取输出乱码的问题。
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //简化写法：直接创建一个字节输入流管道与源文件路径接通
        InputStream is = new FileInputStream("IO\\src\\dlei");
        //定义一个字节数组读取数据（定义一个桶）
//        byte[] buffer = new byte[3];    //通常会填入1024或512，为了测试填入3
//        int len = is.read(buffer);
//        System.out.println("读取的字节数为: " + len);
//        String s = new String(buffer);
//        System.out.println(s);

        //读法优化，必须使用循环
        //定义一个字节数组代表桶
        byte[] buffer = new byte[3];
        // 存储每次读取的字节数
        int len;
        String rs;
        while ((len = is.read(buffer)) != -1) {
            rs = new String(buffer, 0, len);
            System.out.print(rs);
        }
    }
}
