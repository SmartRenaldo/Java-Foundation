package homework_08;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class ResetProperties {
    private static final String PATHNAME = "Reflection\\src\\homework_08\\config.properties";
    private static final int MAX_USE = 3;

    public static void main(String[] args) {
        updateProps(PATHNAME);
    }

    private static void updateProps(String pathname) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(pathname));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (PrintStream ps = new PrintStream(new FileOutputStream(pathname))
        ) {
            int count = Integer.parseInt(properties.getProperty("Runtime"));
            if (count >= MAX_USE) {
                System.out.println("程序使用次数已满，请续费");
            } else {
                count++;
                System.out.println("程序运行了：" + count + "次");
                properties.setProperty("Runtime", String.valueOf(count));
            }
            //加载后必须储存回去
            properties.store(ps, "reset runtime log");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
