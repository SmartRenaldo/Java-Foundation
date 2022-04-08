package _16File类的概述;

import java.io.File;

/**
 * 目标：File类的概述和API
 * <p>
 * File类：代表操作系统的文件对象。
 * File类：是用来操作操作系统的文件对象的，删除文件，获取文件信息，创建文件（文件夹）...
 * 广义来说操作系统认为文件包含（文件和文件夹）
 * <p>
 * File类的创建文件对象的API:
 * 包：java.io.File
 * （1）构造器：
 * -- public File(String pathname):根据路径获取文件对象
 * -- public File(String parent , String child):根据父路径和文件名称获取文件对象！
 * -- public File(File parent , String child)
 * <p>
 * File类创建文件对象的格式:
 * a.File f = new File("绝对路径/相对路径");
 * 绝对路径：从磁盘的的盘符一路走到目的位置的路径。
 * -- 绝对路径依赖具体的环境，一旦脱离环境，代码可能出错！！
 * -- 一般是定位某个操作系统中的某个文件对象。
 * 相对路径：不带盘符的。（重点）
 * -- 默认是直接相对到工程目录下寻找文件的。
 * -- 相对路径只能用于寻找工程下的文件。
 * -- 能用相对路径就应该尽量使用，可以跨平台！
 * <p>
 * b.File f = new File("文件对象/文件夹对象");
 * 广义来说：文件是包含文件和文件夹的。
 * 小结：
 * 创建文件对象可以用绝对路径也可以用相对路径。
 * 相对路径只能用于寻找工程下的文件。
 * 文件对象可以表示文件也可以表示文件夹！
 */
public class Demo {
    public static void main(String[] args) {
        // 1.创建文件对象：使用绝对路径
        // 文件路径分隔符：
        //    -- a.使用正斜杠： /
        //    -- b.使用反斜杠： \\
        //    -- c.使用分隔符API: File.separator
        //File file1 = new File("D:\\2020 semester2\\7202\\Day09Demo\\students.txt");
        //File file1 = new File("D:/2020 semester2/7202/Day09Demo/students.txt");
        File file1 = new File("D:" + File.separator + "2020 semester2" + File.separator
                + "7202" + File.separator + "Day09Demo" + File.separator + "students.txt");
        System.out.println("file1.exists() = " + file1.exists());
        System.out.println("file1.length() = " + file1.length());
        //System.out.println("file1.delete() = " + file1.delete());
        //System.out.println("file1.exists() = " + file1.exists());

        // 2.创建文件对象：使用相对路径
        File file2 = new File("IO\\src\\_16File类的概述\\Test.txt");
        System.out.println("file2.exists() = " + file2.exists());
        System.out.println("file2.length() = " + file2.length());

        // 3.创建文件对象：代表文件夹
        File file3 = new File("Lambda&构造方法\\src\\_02Lambda表达式简化Runnable接口匿名内部类");
        //无法反映文件夹所包含全部内容的大小，仅反映文件夹本身的大小
        System.out.println("file3.length() = " + file3.length());
        System.out.println("file3.exists() = " + file3.exists());
    }
}
