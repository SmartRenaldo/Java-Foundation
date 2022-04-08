package homework_01;

import java.io.File;

/**
 * 3.1． 训练知识点
 * 1.单级文件夹的创建
 * 3.2． 训练描述
 * 在C盘下创建一个名为bbb的文件夹。
 * 3.3． 操作步骤描述
 * 1. 创建文件对象指定路径为c:/bbb
 * 2. 调用文件对象创建文件夹的方法
 */
public class Demo01 {
    public static void main(String[] args) {
        final File file = new File("c:/bbb");
        file.mkdir();
    }
}
