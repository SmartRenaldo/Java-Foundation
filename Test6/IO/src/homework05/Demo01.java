package homework05;

import java.io.File;

/**
 * 6.1． 训练知识点
 * 1.获取文件信息：文件名，文件大小，文件的绝对路径，文件的父路径
 * 6.2． 训练描述
 * 获取C盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。
 * 6.3． 操作步骤描述
 * 1. 在c盘aaa文件夹中创建一个b.txt文件并输入数据
 * 2. 创建文件对象关联路径：c:/aaa/b.txt
 * 3. 调用文件对象的相关方法获得信息并输出。可以通过API帮助文档查询方法。
 */
public class Demo01 {
    public static void main(String[] args) {
        final File dir = new File("C:\\aaa");
        final File file = new File("c:/aaa/b.txt");

        System.out.println("file.getName() = " + file.getName());
        //获取文件大小
        System.out.println("file.length() = " + file.length());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        //获取父路径
        System.out.println("file.getParent() = " + file.getParent());
    }
}
