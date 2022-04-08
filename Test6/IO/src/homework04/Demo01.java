package homework04;

import java.io.File;

/**
 * 1.删除文件和文件夹
 * 5.2． 训练描述
 * 将D盘下a.txt文件删除
 * 将C盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。
 */
public class Demo01 {
    public static void main(String[] args) {
        final File file1 = new File("D:\\a.txt");
        final File file2 = new File("C:\\aaa");
        file1.delete();
        file2.delete();
    }
}
