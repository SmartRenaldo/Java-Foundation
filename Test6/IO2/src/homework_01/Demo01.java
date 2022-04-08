package homework_01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 4.1． 训练知识点
 * 1.高效字符流和集合的综合使用
 * 4.2． 训练描述
 * 分析以下需求，并用代码实现
 * 实现一个验证码小程序，要求如下：
 * 1. 在项目根目录下新建一个文件：data.txt，键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一
 * 行；
 * 2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在
 * 控制台提示验证失败
 */
public class Demo01 {
    private static final String PATHNAME = "IO2\\src\\homework02\\data.txt";
    /**
     * Scanner不能关闭后再开启新的Scanner，这样会抛出NoSuchElementException异常！
     */
    private static final Scanner SYS_SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        inputCode(PATHNAME);
        checkCode(PATHNAME);
    }

    private static void inputCode(String pathname) {
        try (final BufferedWriter bw = new BufferedWriter(new FileWriter(pathname));
        ) {
            String code;
            for (int i = 0; i < 3; i++) {
                System.out.print("Please enter code " + (i + 1) + ": ");
                code = SYS_SCANNER.nextLine();
                bw.write(code);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void checkCode(String pathname) {
        try (final BufferedReader br = new BufferedReader(new FileReader(pathname));
        ) {
            List<String> codeList = new ArrayList<>();
            String code;
            while ((code = br.readLine()) != null) {
                codeList.add(code);
            }
            System.out.print("Please input the verification code: ");
            String s = SYS_SCANNER.nextLine();
            if (codeList.contains(s)) {
                System.out.println("Validation successful");
            } else {
                System.out.println("Validation failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
