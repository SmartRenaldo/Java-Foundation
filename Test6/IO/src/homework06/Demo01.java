package homework06;

import java.io.File;

/**
 * 8.1． 训练知识点
 * 1.文件夹的获取方法
 * 8.2． 训练描述
 * 获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
 * 注意：不包含子文件夹下的文件
 * 8.3． 操作步骤描述
 * 1. 创建文件对象关联到指定文件夹，比如：c:/aaa
 * 2. 调用文件对象的listFiles方法获得文件数组
 * 3. 遍历文件数组将每一个文件的名字输出到控制台
 */
public class Demo01 {
    public static void main(String[] args) {
        final File file = new File("D:\\2020 semester2");
        final File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
