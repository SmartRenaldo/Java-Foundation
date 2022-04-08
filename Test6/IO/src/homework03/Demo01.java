package homework03;

import java.io.File;

/**
 * 4.1． 训练知识点
 * 1.多级文件夹的创建
 * 4.2． 训练描述
 * 在C盘下创建一个名为ccc的文件夹，要求如下：
 * 1.ccc文件夹中要求包含bbb子文件夹
 * 2.bbb子文件夹要求包含aaa文件夹
 * 4.3． 操作步骤描述
 * 1. 创建文件对象关联路径：c:/ccc/bbb/aaa
 * 2.调用文件对象创建多级文件夹的方法
 */
public class Demo01 {
    public static void main(String[] args) {
        final File file = new File("c:/ccc/bbb/aaa");
        file.mkdirs();
    }
}
