package _22递归实现文件搜索;

import java.io.File;
import java.io.IOException;

/**
 * 目标：递归实现文件搜索(非规律递归)
 * 需求: 在D:\2020 semester2文件下寻找14928329271228文件
 * 分析：
 * （1）定义一个方法用于做搜索。
 * （2）进入方法中进行业务搜索分析。
 * 小结：
 * 非规律化递归应该按照业务流程开发
 */
public class FileSearch {
    public static void main(String[] args) {
        search(new File("D:\\2020 semester2"), "ci课程计划.pdf");
    }

    /**
     * 在文件夹中搜素文件
     *
     * @param directory: search file in this directory
     * @param name:      file(s) to be searched
     */
    public static void search(File directory, String name) {
        //1. 判断是否存在该路径，是否是文件夹
        if (directory.exists() && directory.isDirectory()) {
            //2. 提取当前目录下的全部一级文件对象
            File[] files = directory.listFiles();
            //3. 判断是否存在一级文件对象（判断是否不为空目录）
            if (files != null && files.length > 0) {
                //4. 遍历文件数组
                for (File file : files) {
                    //5. 判断是file是文件还是文件夹
                    if (file.isFile()) {
                        //6. 判断检索到的文件是否包含要找的关键字
                        if (file.getName().contains(name)) {
                            //7. 打印路径
                            printAndStart(file, "File");
                        }
                        //8. 为文件夹
                    } else {
                        //9. 判断检索到的文件夹是否包含要找的关键字
                        if (file.getName().contains(name)) {
                            //10. 打印路径
                            printAndStart(file, "Directory");
                        }
                        //11. 递归
                        search(file, name);
                    }
                }
            }
        }
    }

    /**
     * 搜索并打开文件/文件夹
     * @param file: file object
     * @param fileType: file or directory
     */
    private static void printAndStart(File file, String fileType) {
        System.out.println(fileType + ": " + file.getAbsolutePath());
        String s = "cmd /c " + "\"" + file.getAbsolutePath() + "\"";
        try {
            // 启动它（拓展）
            Runtime r = Runtime.getRuntime();
            r.exec(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
