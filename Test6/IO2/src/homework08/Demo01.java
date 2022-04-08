package homework08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * 14.1． 训练知识点
 * 1. IO对象Properties结合使用,设置properties文件
 * 14.2． 训练描述
 * 有一个文本文件score.txt，内容如下：
 * zhangsan = 90
 * lisi = 80
 * wangwu = 85
 * 请写一个程序判断文件中是否有"lisi"这样的键存在，如果有修改其对应的值为：100
 * 14.3． 操作步骤描述
 * 1. 创建一个空的Properties集合
 * 2. 读取数据到集合中
 * 3. 遍历集合，获取到每一个key
 * 4. 判断 当前的key 是否为 "lisi"，如果是就把"lisi"的值 设置为100
 * 5. 把集合中所有的信息 ，重新存储到文件中
 */
public class Demo01 {
    private static final String PATHNAME = "IO2\\src\\homework08\\score.properties";

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("zhangsan", "90");
        properties.setProperty("lisi", "80");
        properties.setProperty("wangwu", "85");
        System.out.println("properties = " + properties);
        try (final OutputStream fos = new FileOutputStream(PATHNAME);
        ) {
            properties.store(fos, "Store properties (name & age)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
