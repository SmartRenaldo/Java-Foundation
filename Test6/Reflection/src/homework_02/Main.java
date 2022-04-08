package homework_02;

import java.lang.reflect.Constructor;

/**
 * 3. 案例03：反射案例2
 * 3.1 需求说明
 * 定义一个Student类，用反射去创建一个Student对象，使用Constructor对象的方法创建。
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Class c = Student.class;
        Constructor con = c.getDeclaredConstructor(String.class, int.class);
        Student student = (Student) con.newInstance("Johnson", 5);
        System.out.println("student = " + student);
    }
}
