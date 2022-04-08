package _文件夹复制;

import java.io.*;

/**
 * 需求：把"D:\\2020 semester2\\java进阶13天资料\\code"文件夹复制到"D:\\2020 semester2"中命名为Test
 */
public class CopyDirDemo {
    private static final int KB = 1024;

    public static void main(String[] args) {
        copyDir(new File("D:\\2020 semester2\\java进阶13天资料\\code"), new File("D:\\2020 semester2\\Test"));
    }

    /**
     * 文件夹复制
     *
     * @param srcDir:  源文件夹
     * @param destDir: 目标文件夹
     */
    private static void copyDir(File srcDir, File destDir) {
        if (srcDir.exists() && srcDir.isDirectory()) {
            destDir.mkdirs();
            File[] files = srcDir.listFiles();
            if (files != null && files.length > 0) {
                for (File file : files) {
                    if (file.isFile()) {
                        copyFile(file, new File(destDir, file.getName()));
                    } else {
                        copyDir(file, new File(destDir, file.getName()));
                    }
                }
            }
        }
    }

    private static void copyFile(File srcFile, File destFile) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        ) {
            int len;
            byte[] buffer = new byte[KB];
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
