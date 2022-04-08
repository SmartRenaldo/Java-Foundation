package homework09;

import java.io.File;
import java.util.Scanner;

/**
 * 6.1． 训练知识点
 * 1.文件获取方法
 * 2.递归的使用
 * 6.2． 训练描述
 * 从键盘接收一个文件夹路径,获得该文件夹大小并输出到控制台。
 * 6.3． 操作步骤描述
 * 1. 创建键盘录入对象Scanner
 * 2. 定义字符串接收用户输入的文件夹路径
 * 3. 根据文件夹路径创建文件对象
 * 4. 定义一个方法calculate用来计算指定文件夹的大小，接收文件参数，返回long类型数值表示文件夹的大小。
 * 5. 调用calculate方法传入文件夹对象，在该方法内部获得文件夹中所有文件，得到一个文件数组，定义一个变
 * 量size累加每一个文件的大小，遍历文件数组，判断是否是文件，如果是文件则获得文件大小并累加到变量
 * size中，如果是文件夹，继续递归调用当前方法。
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        final File file = new File(s);
        System.out.println("cauculate(file) = " + cauculate(file));
    }

    private static long cauculate(File file) {
        final File[] files = file.listFiles();
        long size = 0L;
        for (File f : files) {
            if (f.isFile()) {
                size += f.length();
            } else size += cauculate(f);
        }
        return size;
    }
}
