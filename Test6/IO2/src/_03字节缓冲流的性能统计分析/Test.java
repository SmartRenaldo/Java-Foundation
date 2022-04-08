package _03字节缓冲流的性能统计分析;

import java.io.*;

/**
 * 目标：利用字节流的复制统计各种写法形式下缓冲流的性能执行情况。
 * <p>
 * 复制流：
 * （1）使用低级的字节流按照一个一个字节的形式复制文件。
 * （2）使用低级的字节流按照一个一个字节数组的形式复制文件。
 * （3）使用高级的缓冲字节流按照一个一个字节的形式复制文件。
 * （4）使用高级的缓冲字节流按照一个一个字节数组的形式复制文件。
 * <p>
 * 源文件：D:\itcast\班级\Java就业128期\day08\15.并发包ConcurrentHashMap.avi
 * 目标文件：D:\itcast\班级\new新视频.avi
 * <p>
 * 小结：
 * 高级的字节缓冲流按照一个一个字节数组的形式复制性能极高，建议以后使用！
 */
public class Test {
    private static final String ORIGINAL_FILE = "D:\\2020 semester2\\S01E01.mp4";
    private static final String TARGET_FILE = "D:\\2020 semester2\\";
    private static final double ONE_THOUSAND = 1000.0;
    private static final int KB = 1024;

    public static void main(String[] args) {
        //copy01();       //低级流一个一个字节复制，很慢，很垃圾，禁止使用
        copy02();       //低级的字节流按照一个一个字节数组的形式复制 ,读取较慢,0.29s
        copy03();       //高级的缓冲字节流按照一个一个字节的形式复制 ,读取较慢,0.8s
        copy04();       //高级的字节缓冲流按照一个一个字节数组的形式复制,速度极快,建议使用, 0.074s
    }

    public static void copy01() {
        long startTimer = System.currentTimeMillis();
        try (InputStream is = new FileInputStream(ORIGINAL_FILE);
             OutputStream os = new FileOutputStream(TARGET_FILE + "Test01.mp4");
        ) {
            int ch;
            while ((ch = is.read()) != -1) {
                os.write(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        long endTimer = System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节的形式复制文件耗时："
                + (endTimer - startTimer) / ONE_THOUSAND + "s");
    }

    public static void copy02() {
        long startTimer = System.currentTimeMillis();
        try (InputStream is = new FileInputStream(ORIGINAL_FILE);
             OutputStream os = new FileOutputStream(TARGET_FILE + "Test02.mp4");
        ) {
            byte[] buffer = new byte[KB];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        long endTimer = System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节数组的形式复制文件耗时："
                + (endTimer - startTimer) / ONE_THOUSAND + "s");
    }

    public static void copy03() {
        long startTimer = System.currentTimeMillis();
        try (InputStream is = new FileInputStream(ORIGINAL_FILE);
             BufferedInputStream bis = new BufferedInputStream(is);
             OutputStream os = new FileOutputStream(TARGET_FILE + "Test03.mp4");
             BufferedOutputStream bos = new BufferedOutputStream(os);
        ) {
            int ch;
            while ((ch = bis.read()) != -1) {
                bos.write(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        long endTimer = System.currentTimeMillis();
        System.out.println("使用高级的缓冲字节流按照一个一个字节的形式复制文件耗时："
                + (endTimer - startTimer) / ONE_THOUSAND + "s");
    }

    public static void copy04() {
        long startTimer = System.currentTimeMillis();
        try (InputStream is = new FileInputStream(ORIGINAL_FILE);
             BufferedInputStream bis = new BufferedInputStream(is);
             OutputStream os = new FileOutputStream(TARGET_FILE + "Test04.mp4");
             BufferedOutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] buffer = new byte[KB];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        long endTimer = System.currentTimeMillis();
        System.out.println("使用高级的缓冲字节流按照一个一个字节数组的形式复制文件耗时："
                + (endTimer - startTimer) / ONE_THOUSAND + "s");
    }
}
