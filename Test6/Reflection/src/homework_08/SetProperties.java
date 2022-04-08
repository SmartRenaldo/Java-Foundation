package homework_08;

import java.io.*;
import java.util.Properties;

public class SetProperties {
    /**
     * 有一个用于记录程序运行次数的属性文件，运行次数保存在一个count属性中，当到达指定次数3次时，则提示:"程序使
     * 用次数已满，请续费"
     * 1. 开发思路：
     * 1). 判断属性文件是否存在，如果不存在则创建一个。
     * 2). 使用load()方法加载文件中所有的属性到Properties集合中。
     * 3). 取得count属性，如果count属性为null，则设置count属性为0。
     * 4). 将取得的字符串转成整型，并判断是否大于等于3次，大于3次则到期，退出。
     * 5). 小于3则输出运行次数，并加1。
     * 6). 将整数转成字符串后存到Properties集合中。
     * 7). 创建输出流，并用store方法保存到文件中。
     */
    private static final String PATHNAME = "Reflection\\src\\homework_08\\config.properties";

    public static void main(String[] args) {
        initializeProps(PATHNAME);
    }

    private static void initializeProps(String pathname) {
        Properties properties = new Properties();
        properties.setProperty("Runtime", "0");
        try (PrintStream ps = new PrintStream(new FileOutputStream(pathname))) {
            properties.store(ps, "runtime log");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
