package _10CommonsIO包介绍;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 目标:Commons-io包的使用介绍。
 * <p>
 * 什么是Commons-io包？
 * commons-io是apache开源基金组织提供的一组有关IO操作的类库，
 * 可以挺提高IO功能开发的效率。commons-io工具包提供了很多有关io操作的类，
 * 见下表：
 * | 包                                  | 功能描述                                     |
 * | ----------------------------------- | :------------------------------------------- |
 * | org.apache.commons.io               | 有关Streams、Readers、Writers、Files的工具类 |
 * | org.apache.commons.io.input         | 输入流相关的实现类，包含Reader和InputStream  |
 * | org.apache.commons.io.output        | 输出流相关的实现类，包含Writer和OutputStream |
 * | org.apache.commons.io.serialization | 序列化相关的类
 * 步骤：
 * 1. 下载commons-io相关jar包；http://commons.apache.org/proper/commons-io/
 * 2. 把commons-io-2.6.jar包复制到指定的Module的lib目录中
 * 3. 将commons-io-2.6.jar加入到classpath中
 * 小结：
 * IOUtils和FileUtils可以方便的复制文件和文件夹！！
 */
public class CommonsIO {
    public static void main(String[] args) throws Exception {
        // 1.完成文件复制
        IOUtils.copy(new FileInputStream("TestXML\\xml\\student.xml"),
                new FileOutputStream("IO2\\src\\_10CommonsIO包介绍\\CommonsIO\\std.txt"));
        // 2.完成文件复制到某个文件夹下
        //FileUtils.copyFileToDirectory(new File("TestXML\\xml\\student.xml"),
        //        new File("D:\\2020 semester2"));
        // 3.完成文件夹复制到某个文件夹下！
        //FileUtils.copyDirectoryToDirectory(new File("D:\\2020 semester2\\Day08Demo\\src\\com\\itheima\\_01线程通信"),
        //        new File("D:\\"));


        //  Java从1.7开始提供了一些nio, 自己也有一行代码完成复制的技术。
        Files.copy(Paths.get("TestXML\\xml\\student.xml"),
                new FileOutputStream("IO2\\src\\_10CommonsIO包介绍\\Java_Files\\std.txt"));
    }
}
