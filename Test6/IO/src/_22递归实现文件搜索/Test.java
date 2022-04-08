package _22递归实现文件搜索;

import java.io.File;
import java.io.IOException;

/**
 * 需求: 在D:\2020 semester2文件下寻找149文件
 */
public class Test {
    public static void main(String[] args) {
        search(new File("D:\\2020 semester2"), "14928329271228");
    }

    /**
     * 在文件夹下搜索文件
     *
     * @param dirName:  name of directory
     * @param fileName: file(s) to be searched
     */
    private static void search(File dirName, String fileName) {
        if (dirName.isDirectory()) {
            File[] files = dirName.listFiles();
            if (files != null && files.length > 0) {
                for (File file : files) {
                    if (file.isFile() && file.getName().contains(fileName)) {
                        System.out.println(file.getAbsolutePath());
                        String s = "cmd /c" + "\"" + file.getAbsolutePath() + "\"";
                        System.out.println(s);
                        try {
                            Runtime r = Runtime.getRuntime();
                            r.exec(s);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        if (file.getName().contains(fileName)) {
                            System.out.println(file.getAbsoluteFile());
                            String s = "cmd /c" + "\"" + file.getAbsolutePath() + "\"";
                            try {
                                Runtime r = Runtime.getRuntime();
                                r.exec(s);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        search(file, fileName);
                    }
                }
            }
        }
    }
}
