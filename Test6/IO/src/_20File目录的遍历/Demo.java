package _20File目录的遍历;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * 目标：File针对目录的遍历
 * - public String[] list()：
 * 获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
 * - public File[] listFiles()(常用)：
 * 获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
 */
public class Demo {
    public static void main(String[] args) {
        File file1 = new File("D:\\2020 semester2");
        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = file1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
        for (File file : files) {
            System.out.println(file.isDirectory());
        }
        for (File file : files) {
            System.out.println(file.getName());
        }

        // ------------拓展------------
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (File file : files) {
            long lastModified = file.lastModified();    // 最后修改时间！
            System.out.println("simpleDateFormat.format(lastModified) of " + file.getName()
                    + " is " + simpleDateFormat.format(lastModified));
        }
    }
}
