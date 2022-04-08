package homework12;

import java.io.File;

/**
 * 4.1． 训练知识点
 * 1.文件的获取
 * 2.文件的判断
 * 3.递归的使用
 * 4.2． 训练描述
 * 从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印
 * 例如:
 * aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,有eee这样的文件夹,eee中有fff.txt和ggg.txt,打印出层级来
 * aaa
 * bbb.txt
 * ccc.txt
 * ddd.txt
 * eee
 * fff.txt
 * ggg.txt
 */
public class Demo12 {
    public static void main(String[] args) {
        print(new File("D:\\2020 semester2\\7202\\01python核心编程阶段-linux基础"), 0);
    }

    private static void print(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(file.getName());
        final File[] files = file.listFiles();
        if (file.isDirectory()) {
            for (File f : files) {
                print(f, level + 1);
            }
        }
    }
}
