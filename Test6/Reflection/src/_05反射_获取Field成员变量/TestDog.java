package _05反射_获取Field成员变量;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

/**
 * 目标：反射_获取Field成员变量对象。
 * <p>
 * 反射的第一步是先得到Class类对象。
 * <p>
 * 1、Field getField(String name);
 * 根据成员变量名获得对应Field对象，只能获得public修饰
 * 2.Field getDeclaredField(String name);
 * 根据成员变量名获得对应Field对象，只要申明了就可以得到
 * 3.Field[] getFields();
 * 获得所有的成员变量对应的Field对象，只能获得public的
 * 4.Field[] getDeclaredFields();
 * 获得所有的成员变量对应的Field对象，只要申明了就可以得到
 * 小结：
 * 获取全部成员变量：getDeclaredFields
 * 获取某个成员变量：getDeclaredField
 */
public class TestDog {
    /**
     * 获取某个成员变量对象
     *
     * @throws NoSuchFieldException
     */
    @Test
    public void getDeclaredField() throws NoSuchFieldException {
        Class c = Dog.class;
        Field field = c.getDeclaredField("age");
        System.out.println(field.getName() + " ---> " + field.getType());
    }

    /**
     * 获取全部的成员变量
     */
    @Test
    public void getDeclaredFields() {
        Class c = Dog.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " ---> " + field.getType());
        }
    }
}
