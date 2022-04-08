package _04字符缓冲流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExecDemo02 {
    private static final List<Character> sizes = new ArrayList<>();

    static {
        //（4）对List集合中的每个元素按照首字符排序
        Collections.addAll(sizes, '零', '一', '二', '三', '四', '五', '六', '七', '八', '九');
    }

    public static void main(String[] args) {
        try (//（1）创建一个缓冲字符输入流对象包装字符输入流接通源文件
             BufferedReader bf =
                     new BufferedReader(new FileReader("IO2\\src\\_04字符缓冲流\\csb"));
             //（5）创建一个缓冲字符输出流管道通向目标文件
             BufferedWriter bw =
                     new BufferedWriter(new FileWriter("IO2\\src\\_04字符缓冲流\\newCsb"));
        ) {
            //（2）定义一个List集合用于存储每段文章
            final List<String> data = new ArrayList<>();
            //（3）定义一个循环按照行读取每段文章，存入到List集合中去
            String line;
            while ((line = bf.readLine()) != null) {
                data.add(line);
            }

            //（4）排序部分
            //data.sort((s1, s2) -> sizes.indexOf(s1.charAt(0)) - sizes.indexOf(s2.charAt(0)));
            //更高级一点的写法
            data.sort(Comparator.comparingInt(s -> sizes.indexOf(s.charAt(0))));
            //（6）遍历List集合中的每个元素，通过缓冲字符输出管道写出到目标文件
            for (String s : data) {
                bw.write(s);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
