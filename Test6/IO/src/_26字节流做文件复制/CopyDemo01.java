package _26字节流做文件复制;

import java.io.*;

/**
 * 目标：字节流做文件复制。
 * <p>
 * 字节流复制的思想：
 * 字节是计算机中一切文件的组成，所以
 * 字节流适合做一切文件的复制。
 * 复制是把源文件的全部字节一字不漏的转移到目标文件，只要文件前后的格式一样，绝对不会有问题。
 * <p>
 * 需求：
 * 原文件：C:\Users\Gavin\Downloads\meinv.jpg
 * 目标文件：D:\2020 semester2\7202\doubi.jpg
 * 分析步骤：
 * （1）创建一个字节输入流管道与源文件接通。
 * （2）创建一个字节输出流与目标文件接通。
 * （3）创建一个字节数组作为桶
 * （4）从字节输入流管道中读取数据，写出到字节输出流管道即可。
 * （5）关闭资源！
 */
public class CopyDemo01 {
    private static final int KB = 1024;

    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream("C:\\Users\\Gavin\\Downloads\\meinv.jpg");
            os = new FileOutputStream("D:\\2020 semester2\\7202\\doubi.jpg");
            byte[] buffer = new byte[KB];
            int len;
            while ((len = is.read(buffer)) != -1) {
                // 读取多少就倒出多少
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
