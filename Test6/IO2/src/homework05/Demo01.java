package homework05;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 9.1． 训练知识点
 * 1. 字节打印流的使用
 * 9.2． 训练描述
 * 从键盘录入一行字符串，利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中
 * 9.3． 操作步骤描述
 * 1. 创建字节打印流对象并关联文件路径
 * 2. 调用字节打印流对象的打印方法将内容输入到目标文件中
 * 3. 关闭流释放资源
 */
public class Demo01 {
    public static void main(String[] args) {
        try (final PrintStream ps = new PrintStream("IO2\\src\\homework05\\d.txt");
        ) {
            ps.println("我在快乐学习");
            ps.print("\n");
            ps.println("学习让我快乐");
            ps.print("\r\n");
            ps.println("Awesome");

            ps.write("天天快乐".getBytes());
            ps.write("\r\n".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
