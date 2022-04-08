package _06反射_获取Method方法并执行;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 目标：反射——获取Method方法对象
 * <p>
 * 反射获取类的Method方法对象：
 * 1、Method getMethod(String name,Class...args);
 * 根据方法名和参数类型获得对应的方法对象，只能获得public的
 * <p>
 * 2、Method getDeclaredMethod(String name,Class...args);
 * 根据方法名和参数类型获得对应的方法对象，包括private的
 * <p>
 * 3、Method[] getMethods();
 * 获得类中的所有成员方法对象，返回数组，只能获得public修饰的且包含父类的
 * <p>
 * 4、Method[] getDeclaredMethods();
 * 获得类中的所有成员方法对象，返回数组,只获得本类申明的方法。
 * <p>
 * Method的方法执行：
 * Object invoke(Object obj, Object... args)
 * 参数一：触发的是哪个对象的方法执行。
 * 参数二： args：调用方法时传递的实际参数
 */
public class TestDog {
    @Test
    public void getDeclaredMethod() throws Exception {
        // a.先获取class类对象
        Class c = Dog.class;
        Dog maltese = new Dog();
        // b.定位它的某个方法
        Method run = c.getDeclaredMethod("run");
        // c.触发方法执行!
        // 触发maltese对象的run()方法执行
        Object runObj = run.invoke(maltese);
        // 如果方法没有返回值，结果是null
        System.out.println("runObj = " + runObj);

        /**
         * 参数一：方法名称
         * 参数二：(一个或多个)方法的参数和类型(可变参数！)
         */
        Method eat = c.getDeclaredMethod("eat", String.class);
        eat.setAccessible(true);
        /**
         * 参数一：被触发方法所在的对象
         * 参数二：方法需要的入参值
         */
        Object eatObj = eat.invoke(maltese, "meat");
        System.out.println("eatObj = " + eatObj);
    }
}
