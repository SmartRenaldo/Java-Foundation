package _07暴力攻击集合泛型;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 拓展
 * 1.反射可以破坏面向对象的封装性（暴力反射）。
 * 2.同时可以破坏泛型的约束性。
 */
public class ReflectDemo {
    @Test
    public void genericity() throws Exception {
        List<Double> list = new ArrayList<>();
        list.add(12.5);
        list.add(935.2);
        list.add(-2.5);

        Class c = list.getClass();
        Method add = c.getDeclaredMethod("add", Object.class);
        add.invoke(list, "Madonna");

        System.out.println("list = " + list);
    }
}
