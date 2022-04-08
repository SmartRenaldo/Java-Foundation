package homework_07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Properties;

public class GetProperties {
    private Properties properties;
    private Class c;
    private static final String PATHNAME = "D:\\IdeaProjects\\Test\\Reflection\\src\\homework_07\\config.properties";

    @BeforeEach
    public void init() {
        properties = new Properties();
        c = Properties.class;
    }

    @Test
    public void testProperties() {
        //加载属性文件不能用BufferedInputStream操作
        try (InputStream is = new FileInputStream(PATHNAME)) {
            Method load = c.getDeclaredMethod("load", InputStream.class);
            load.invoke(properties, is);
            System.out.println("properties = " + properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
