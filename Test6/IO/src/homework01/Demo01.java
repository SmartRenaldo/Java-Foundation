package homework01;

import java.io.File;
import java.io.IOException;

/**
 * 2.1． 训练知识点
 * 1.检查文件是否存在
 * 2.文件的创建
 * 2.2． 训练描述
 * 检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
 * 2.3． 操作步骤描述
 * 1. 使用绝对路径创建对象关联到D盘的a.txt。
 * 2. 通过文件对象方法判断文件是否存在。
 * 3. 不存在则调用创建文件的方法创建文件。
 */
public class Demo01 {
    private static final String FILE = "D:/a.txt";

    public static void main(String[] args) {
        File file = new File(FILE);
        System.out.println("file.exists() = " + file.exists());
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
