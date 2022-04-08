package _06转换流;

import java.io.*;

/**
 * 目标：字符输出转换OutputStreamWriter流的使用。
 * <p>
 * 字节流                                         字符流
 * 字节输入流               字节输出流              字符输入流            字符输出流
 * InputStream             OutputStream          Reader               Writer   (抽象类)
 * FileInputStream         FileOutputStream      FileReader           FileWriter(实现类)
 * BufferedInputStream     BufferedOutputStream  BufferedReader       BufferedWriter(实现类，缓冲流)
 * InputStreamReader    OutputStreamWriter
 * 字符输出转换流：OutputStreamWriter
 * -- 作用：可以指定编码把字节输出流转换成字符输出流。
 * 可以指定写出去的字符的编码。
 * -- 构造器：
 * public OutputStreamWriter(OutputStream os) :   用当前默认编码UTF-8把字节输出流转换成字符输出流
 * public OutputStreamWriter(OutputStream os , String charset):指定编码把字节输出流转换成字符输出流
 * 小结：
 * 字符输出转换流可以指定编码把字节输出流转换成字符输出流。
 * 从而实现指定写出去的字符编码！
 */
public class OutputStreamWriterDemo01 {
    public static void main(String[] args) {
        try (OutputStream os =
                     new FileOutputStream("IO2\\src\\_06转换流\\dlei01.txt");
             //把字节输出流按照默认编码UTF-8转换成字符输出流
             //Writer osw = new OutputStreamWriter(os);
             //把字节输出流按照指定编码GBK转换成字符输出流
             Writer osw = new OutputStreamWriter(os,"GBK");
             BufferedWriter bw = new BufferedWriter(osw);
        ) {
            bw.write("我在学Java");
            bw.newLine();
            bw.write("JAVA是最优美的语言");
            bw.newLine();
            bw.write("Java爱我");
            bw.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
