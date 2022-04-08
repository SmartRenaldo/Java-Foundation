package _homework02;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMyTest {
    @MyTest
    public void test01() {
        System.out.println("---test01---");
    }

    public void test02() {
        System.out.println("---test02---");
    }

    @MyTest
    public void test03() {
        System.out.println("---test03---");
    }

    @Test
    public void testMethod(){
        Class c = TestMyTest.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                try {
                    method.invoke(new TestMyTest());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
