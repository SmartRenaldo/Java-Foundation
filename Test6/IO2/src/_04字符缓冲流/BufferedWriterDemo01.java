package _04字符缓冲流;

import java.io.*;

/**
 * 目标：字符缓冲输出流的使用。
 * <p>
 * 字节流                              字符流
 * 字节输入流               字节输出流              字符输入流         字符输出流
 * InputStream             OutputStream          Reader            Writer   (抽象类)
 * FileInputStream         FileOutputStream      FileReader        FileWriter(实现类)
 * BufferedInputStream     BufferedOutputStream  BufferedReader    BufferedWriter(实现类，缓冲流)
 * <p>
 * 字符缓冲输出流：BufferedWriter
 * -- 作用：把字符输出流包装成一个高级的缓冲字符输出流，提高写字符数据的性能。
 * -- 构造器：public BufferedWriter(Writer writer):
 * -- 原理：高级的字符缓冲输出流多了一个8k的字符缓冲池，写数据性能极大提高了!
 * -- 字符缓冲输出流除了提高字符输出流写数据的性能，还多了一个换行的特有功能：
 * public void newLine()：新建一行。
 * 小结：
 * 缓冲字符输出流可以把低级的字符输出流进行包装。提高了写字符的性能。
 * 多了一个换行的功能：public void newLine()：新建一行。
 */
public class BufferedWriterDemo01 {
    public static void main(String[] args) {
        try (//覆盖数据管道
             final Writer fw = new FileWriter("IO2\\src\\_04字符缓冲流\\dlei02");
             //追加数据管道
             //final Writer fw = new FileWriter("IO2\\src\\_04字符缓冲流\\dlei02", true);
             //错误写法： final BufferedWriter bf = new BufferedWriter(fw, true) ;
             final BufferedWriter bf = new BufferedWriter(fw);
        ) {
            bf.write("我在学IO流");
            bf.newLine();       //换行，相当于bf.write("\r\n");
            bf.write("我在学JAVA");
            bf.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
