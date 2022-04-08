package homework08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

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

/**
 * 不能同时使用FileInputStream和FileOutputStream
 */
public class Demo02 {
    private static final String PATHNAME = "IO2\\src\\homework08\\score.properties";

/*    public static void main(String[] args) throws Exception{
        //1：创建一个空的集合 
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(PATHNAME);
        // 2:读取数据到集合中 
        prop.load(fis);
        //3:遍历集合，获取到每一个key 
        Set<String> keys = prop.stringPropertyNames();
        //获取到每一个key
        for (String key : keys) {
            if ("lisi".equals(key)){
                prop.setProperty(key, "100");
            }
        }
        FileOutputStream fos = new FileOutputStream(PATHNAME);
        //把集合中所有的信息 ，重新存储到文件中 
        prop.store(fos, null);
        fos.close();
    }*/
    //private static final String PATHNAME = "IO2\\src\\homework08\\score.properties";

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        final FileInputStream FIS = new FileInputStream(PATHNAME);

        properties.load(FIS);
        System.out.println("properties = " + properties);

        final Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            if ("lisi".equals(key)){
                properties.setProperty(key, "100");
            }
        }
        final FileOutputStream FOS = new FileOutputStream(PATHNAME);
        properties.store(FOS, null);

    }
}
