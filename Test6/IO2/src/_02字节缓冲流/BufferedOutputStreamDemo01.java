package _02字节缓冲流;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 目标：字节缓冲输出流的使用。
 * <p>
 * 字节流                              字符流
 * 字节输入流               字节输出流              字符输入流         字符输出流
 * InputStream             OutputStream          Reader            Writer   (抽象类)
 * FileInputStream         FileOutputStream      FileReader        FileWriter(实现类)
 * BufferedInputStream     BufferedOutputStream  BufferedReader    BufferedWriter(实现类，缓冲流)
 * <p>
 * 字节缓冲输出流：BufferedOutputStream
 * -- 作用：可以把低级的字节输出流包装成一个高级的缓冲字节输出流，从而提高写数据的性能。
 * -- 构造器：public BufferedOutputStream(OutputStream os)
 * -- 原理：缓冲字节输出流自带了8KB缓冲池,数据就直接写入到缓冲池中去，性能极高了！
 * 小结：
 * 字节缓冲输出流可以把低级的字节输出流包装成一个高级的缓冲字节输出流，从而提高写数据的性能。
 * 功能几乎不变。
 */
public class BufferedOutputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("IO2\\src\\_02字节缓冲流\\dlei02");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        bos.write("abcd".getBytes());
        bos.write("我爱你".getBytes());
        bos.write("\r\n".getBytes());
        bos.write("www\nsss\r".getBytes());
        bos.write("www\rsss".getBytes());
        bos.close();
        System.out.println("写入成功");
    }
}
