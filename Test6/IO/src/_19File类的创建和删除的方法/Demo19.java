package _19File类的创建和删除的方法;

import java.io.File;
import java.io.IOException;

/**
 * 目标：File类的创建和删除的方法
 * - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，
 * 创建一个新的空文件。 （几乎不用的，因为以后文件都是自动创建的！）
 * - public boolean delete() ：删除由此File表示的文件或目录。 （只能删除空目录）
 * - public boolean mkdir() ：创建由此File表示的目录。（只能创建一级目录）
 * - public boolean mkdirs() ：可以创建多级目录（建议使用的）
 */
public class Demo19 {
    public static void main(String[] args) {
        File file1 = new File("D:\\2020 semester2\\7202\\01python核心编程阶段-linux基础\\javaccc");
        // a.创建新文件，创建成功返回true ,反之返回false
        try {
            System.out.println("file1.createNewFile() = " + file1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // b.删除文件或者空文件夹
        System.out.println("file1.delete() = " + file1.delete());

        // c.创建一级目录
        File file2 = new File("D:\\2020 semester2\\7202\\01python核心编程阶段-linux基础\\aaa");
        System.out.println("file2.mkdir() = " + file2.mkdir());
        System.out.println("file2.delete() = " + file2.delete());

        // d.创建多级目录
        File file3 = new File("D:\\2020 semester2\\7202\\01python核心编程阶段-linux基础\\bbb\\ccc\\ddd");
        System.out.println("file3.mkdirs() = " + file3.mkdirs());
    }
}
