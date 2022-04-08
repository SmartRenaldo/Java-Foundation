package homework10;

import java.io.File;
import java.io.FileFilter;

/**
 * 1.1． 训练知识点
 * 1.文件获取和判断方法
 * 2.文件过滤器
 * 3.递归的使用
 * 1.2． 训练描述
 * 使用文件过滤器筛选将指定文件夹下的小于200K的小文件获取并打印(包括所有子文件夹的文件)。
 */
public class Demo01 {
    public static void main(String[] args) {
        fileFilter(new File("D:\\2020 semester2\\7202"));
    }

    private static void fileFilter(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("It is a file rather than a directory");
            } else {
/*
                final File[] files = file.listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        if (pathname.isDirectory()) return true;
                        long length = pathname.length();
                        return length / 1024 < 200;
                    }
                });
*/
                final File[] files = file.listFiles(pathname -> {
                    if (pathname.isDirectory()) return true;
                    long length = pathname.length();
                    return length / 1024 < 200;
                });

                for (File f : files) {
                    if (f.isDirectory()){
                        fileFilter(f);
                        continue;
                    }
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
