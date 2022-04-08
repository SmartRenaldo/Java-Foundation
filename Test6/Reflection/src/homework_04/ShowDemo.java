package homework_04;

/**
 * 5. 案例05：反射案例4
 * 5.1 需求说明
 * 1. 编写一个类A，定义一个实例方法showString ，用于打印一个字符串。
 * 2. 在编写一个类TestA，用键盘输入一个字符串，该字符串就是类A的全名，使用反射机制创建该类的对象，并
 * 调用该对象中的方法showString
 */
public class ShowDemo {
    public void showString(String s){
        System.out.println(s);
    }
}
