package homework06;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 10.1． 训练知识点
 * 1. 高效字符流读写数据
 * 10.2． 训练描述
 * 项目根路径下有text.txt文件，内容如下：
 * 我爱黑马
 * 123456
 * 利用IO流的知识读取text.txt文件的内容反转后写入text1.txt文件中，内容如下：
 * 123456
 * 我爱黑马
 * 提示：List集合反转元素的顺序时，用到了如下API。
 * java.util 类 Collections
 * static void reverse(List<?> list) 反转指定列表中元素的顺序。
 */
public class Demo01 {
    private static final String PATHNAME01 = "IO2\\src\\homework06\\test.txt";
    private static final String PATHNAME02 = "IO2\\src\\homework06\\test1.txt";

    public static void main(String[] args) {
        writeData(PATHNAME01, PATHNAME02);
        readData(PATHNAME02);
    }

    /**
     * extract and edit file from one file into another
     *
     * @param pathname01: pathname of file to be modified
     * @param pathname02: store the modified data of pathname01
     */
    private static void writeData(String pathname01, String pathname02) {
        try (final BufferedReader br = new BufferedReader(new FileReader(PATHNAME01));
             final BufferedWriter bw = new BufferedWriter(new FileWriter(PATHNAME02));
        ) {
            final List<String> list = new ArrayList<>();
            String s;
            while ((s = br.readLine()) != null) {
                list.add(s);
            }
            Collections.reverse(list);
            for (String str : list) {
                bw.write(str);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * pathname of file to be print
     *
     * @param pathname: pathname of file
     */
    private static void readData(String pathname) {
        try (final BufferedReader br = new BufferedReader(new FileReader(PATHNAME02));
        ) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
