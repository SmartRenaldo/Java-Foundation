package _26字节流做文件复制;

import java.io.*;

/**
 * 目标：JDK 1.7开始之后释放资源的新方式
 * <p>
 * try-with-resources:
 * try(
 * // 这里只能放置资源对象，用完会自动调用close()关闭
 * ){
 * <p>
 * }catch(Exception e){
 * e.printStackTrace();
 * }
 * 什么是资源？
 * 资源类一定是实现了Closeable接口，实现这个接口的类就是资源
 * 有close()方法，try-with-resources会自动调用它的close()关闭资源。
 */
public class CopyDemo02 {
    private static final int KB = 1024;

    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("IO\\src\\_25字节流的使用\\dlei03.txt");
             OutputStream os = new FileOutputStream("IO\\src\\_25字节流的使用\\dlei04.txt");
        ) {
            byte[] bytes = new byte[KB];
            int len;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            System.out.println("复制成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
