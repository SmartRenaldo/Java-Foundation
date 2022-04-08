package _25字节流的使用;

import java.io.*;

/**
 * 目标：字节输入流的使用-按照字节数组读取。
 * <p>
 * IO流的体系：
 * 字节流                                   字符流
 * 字节输入流           字节输出流               字符输入流       字符输出流
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
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //1. 定位文件对象
        File file = new File("IO\\src\\dlei");
        //2. 定义一个字节输入流通向源文件
        InputStream inputStream = new FileInputStream(file);
        System.out.println("文件大小: " + file.length());
        //3. 定义一个字节数组与文件的大小刚刚一样大
        //file.length()返回值为long
        byte[] buffer = new byte[(int) file.length()];
        int len = inputStream.read(buffer);
        System.out.println("读取了: " + len);
        String s = new String(buffer);
        System.out.println(s);

        System.out.println("----------------------------");

        //简化写法(不需获取文件长度)
        InputStream inputStream02 = new FileInputStream("IO\\src\\dlei");
        byte[] buffer02 = inputStream02.readAllBytes();
        String s02 = new String(buffer02);
        System.out.println(s02);
    }
}
