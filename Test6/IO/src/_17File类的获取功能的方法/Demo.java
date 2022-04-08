package _17File类的获取功能的方法;

import java.io.File;

/**
 * 目标：File类的获取功能的API
 * - public String getAbsolutePath()  ：返回此File的绝对路径名字符串。
 * - public String getPath()  ： 获取创建文件对象的时候用的路径
 * - public String getName()  ： 返回由此File表示的文件或目录的名称。
 * - public long length()  ：    返回由此File表示的文件的长度。
 */
public class Demo {
    public static void main(String[] args) {
        // 1.绝对路径创建一个文件对象
        File file1 = new File("D:\\2020 semester2\\7202\\Day09Demo" +
                "\\火狐截图_2020-08-07T11-08-18.229Z.png");
        // a.获取它的绝对路径。
        System.out.println("file1.getAbsolutePath() = " + file1.getAbsolutePath());
        // b.获取文件定义的时候使用的路径。
        System.out.println("file1.getPath() = " + file1.getPath());
        // c.获取文件的名称：带后缀。
        System.out.println("file1.getName() = " + file1.getName());
        // d.获取文件的大小：字节个数。
        System.out.println("file1.length() = " + file1.length());

        System.out.println("------------------------");

        // 2.相对路径
        File file2 = new File("IO\\src\\_16File类的概述\\Test.txt");
        // a.获取它的绝对路径。
        System.out.println("file2.getAbsolutePath() = " + file2.getAbsolutePath());
        // b.获取文件定义的时候使用的路径。
        System.out.println("file2.getPath() = " + file2.getPath());
        // c.获取文件的名称：带后缀。
        System.out.println("file2.getName() = " + file2.getName());
        // d.获取文件的大小：字节个数。
        System.out.println("file2.length() = " + file2.length());
    }
}
