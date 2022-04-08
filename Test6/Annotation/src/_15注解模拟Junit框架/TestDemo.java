package _15注解模拟Junit框架;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * 目标：自定义注解模拟写一个Junit框架的基本使用。
 * <p>
 * 需求：定义若干个方法，只要加了MyTest注解，
 * 就可以被自动触发执行。
 * <p>
 * 分析：
 * （1）定义一个自定义注解MyTest.
 * -- 只能注解方法。
 * -- 存活范围一直都在。
 * （2）定义若干个方法，只要有@MyTest注解的方法就能被触发执行！！
 * 没有这个注解的方法不能执行！！
 * 小结：
 * 注解和反射可以配合解决一些框架思想
 * 注解可以实现标记的成分做特殊处理!!
 */
public class TestDemo {
    @MyTest
    public void test01() {
        System.out.println("---Test01---");
    }

    public void test02() {
        System.out.println("---Test02---");
    }

    @MyTest
    public void test03() {
        System.out.println("---Test03---");
    }

    @MyTest
    public void test04() {
        System.out.println("---Test04---");
    }

    public static void main(String[] args) throws Exception {
        Class c = TestDemo.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                method.invoke(new TestDemo());
            }
        }
    }
}

/**
 * @author Gavin
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyTest {
}
