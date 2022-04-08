package _18File类的判断功能的方法;

import java.io.File;

/**
 * 目标：File类的判断功能的方法
 * - public boolean exists() ：此File表示的文件或目录是否实际存在。
 * - public boolean isDirectory()：此File表示的是否为目录。
 * - public boolean isFile() ：此File表示的是否为文件
 */
public class Demo {
    public static void main(String[] args) {
        // 1.文件对象。
        File file1 = new File("D:\\照片.jpg");
        // a.判断文件路径是否存在
        //文件不存在时，file1.isFile()和file1.isDirectory()都为false
        System.out.println("file1.exists() = " + file1.exists());
        // b.判断文件对象是否是文件,是文件返回true ,反之
        System.out.println("file1.isFile() = " + file1.isFile());
        // c.判断文件对象是否是文件夹,是文件夹返回true ,反之
        System.out.println("file1.isDirectory() = " + file1.isDirectory());

        // 1.文件对象。
        File file2 = new File("D:\\2020 semester2\\7202\\week_04_lecture_07_oop_part1.pdf");
        // a.判断文件路径是否存在
        System.out.println("file2.exists() = " + file2.exists());
        // b.判断文件对象是否是文件,是文件返回true ,反之
        System.out.println("file2.isFile() = " + file2.isFile());
        // c.判断文件对象是否是文件夹,是文件夹返回true ,反之
        System.out.println("file2.isDirectory() = " + file2.isDirectory());
    }
}
