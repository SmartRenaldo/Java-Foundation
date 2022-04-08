package homework_04;

import java.lang.reflect.Method;
import java.util.Scanner;

public class TestA {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a type name: ");
        String className = scanner.nextLine();
        Class c = Class.forName(className);
        Method showString = c.getDeclaredMethod("showString", String.class);
        showString.invoke(new ShowDemo(), "我在快乐学习");

        scanner.close();
    }
}
