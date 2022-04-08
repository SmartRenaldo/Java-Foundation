package homework08;

import java.io.File;
import java.io.FileFilter;

/**
 * 4.1． 训练知识点
 * 1.文件过滤器的使用
 * 4.2． 训练描述
 * 获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
 * 4.3． 操作步骤描述
 * 1. 创建一个类实现文件过滤器FileFilter接口并重新accept方法，在该方法根据传入的文件判断是否文件Java文
 * 件，如果是则返回true，否则返回false。
 * 2. 根据文件夹路径字符串创建文件对象和创建文件过滤器接口实现类对象
 * 3. 调用文件对象的listFiles(FileFilter) 方法，传递文件过滤器实现类对象。
 * 4. 遍历文件数组，输入每一个文件对象
 */
public class Test {
    public static void main(String[] args) {
        final File file = new File("IO\\src\\_25字节流的使用");
        final File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".java")) return true;
                return false;
            }
        });
        // 遍历文件数组,打印所有的Java文件路径
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
