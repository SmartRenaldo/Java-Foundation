package homework_01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 2. 案例02：反射案例1
 * 2.1 需求说明
 * 1. 现有集合：ArrayList list = new ArrayList();
 * 2. 利用反射机制在这个泛型为Integer的ArrayList中存放一个String类型的对象
 */
public class Reflection {
    @Test
    public void testAdd() throws Exception {
        ArrayList<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 3, -5, 8, 25);
        Class c = integers.getClass();
        Method addM = c.getDeclaredMethod("add", Object.class);
        addM.invoke(integers, "Husky");
        System.out.println("integers = " + integers);
    }
}
