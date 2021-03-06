package _05字符流不同编码读取乱码的问题;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 目标：字符流不同编码读取乱码的问题。
 * 引入：
 * 我们之前用的代码编码和文件编码都是UTF-8编码，字符流读取没有出现乱码!!
 * 字符流读取：
 * 代码编码            文件编码         中文情况。
 * UTF-8              UTF-8           不乱码!
 * GBK                GBK             不乱码!
 * UTF-8              GBK             乱码!
 * 小结：
 * 如果代码编码和读取的文件编码一致。字符流读取的时候不会乱码。
 * 如果代码编码和读取的文件编码不一致。字符流读取的时候会乱码。
 */
public class Demo {
    public static void main(String[] args) {
        try (final BufferedReader br =
                     new BufferedReader(new FileReader("D:\\2020 semester2\\7202\\test.txt"));
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
