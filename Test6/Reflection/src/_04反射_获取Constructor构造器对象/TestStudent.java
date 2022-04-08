package _04反射_获取Constructor构造器对象;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

/**
 * 目标：反射_获取Constructor构造器对象.
 * <p>
 * 反射的第一步是先得到Class类对象。（Class文件）
 * <p>
 * 反射中Class类型获取构造器提供了很多的API:
 * 1. Constructor getConstructor(Class... parameterTypes)
 * 根据参数匹配获取某个构造器，只能拿public修饰的构造器，几乎不用！
 * 2. Constructor getDeclaredConstructor(Class... parameterTypes)
 * 根据参数匹配获取某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用！
 * 3. Constructor[] getConstructors()
 * 获取所有的构造器，只能拿public修饰的构造器。几乎不用！！太弱了！
 * 4. Constructor[] getDeclaredConstructors()
 * 获取所有申明的构造器，只要你写我就能拿到，无所谓权限。建议使用！！
 * 小结：
 * 获取类的全部构造器对象： Constructor[] getDeclaredConstructors()
 * -- 获取所有申明的构造器，只要你写我就能拿到，无所谓权限。建议使用！！
 * 获取类的某个构造器对象：Constructor getDeclaredConstructor(Class... parameterTypes)
 * -- 根据参数匹配获取某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用！
 */
public class TestStudent {
    // 1. getConstructors:
    // 获取全部的构造器：只能获取public修饰的构造器。
    // Constructor[] getConstructors()
    @Test
    public void getConstructors() {
        Class c = Student.class;
        Constructor[] constructors = c.getConstructors();
        for (Constructor con : constructors) {
            System.out.println(con.getName() + " ---> " + con.getParameterCount());
        }
    }

    // 2.getDeclaredConstructors():
    // 获取全部的构造器：只要你敢写，这里就能拿到，无所谓权限是否可及
    @Test
    public void getDeclaredConstructors() {
        Class c = Student.class;
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor con : constructors) {
            System.out.println(con.getName() + " ---> " + con.getParameterCount());
        }
    }

    // 3.getConstructor(Class... parameterTypes)
    // 获取某个构造器：只能拿public修饰的某个构造器
    @Test
    public void getConstructor() {
        Class c = Student.class;
        try {
            //报错: 无参构造器为private修饰
            //Constructor constructor = c.getConstructor();
            //System.out.println(constructor.getName() + " ---> " + constructor.getParameterCount());
            Constructor constructor = c.getConstructor(String.class, int.class, String.class);
            System.out.println(constructor.getName() + " ---> " + constructor.getParameterCount());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    // 4.getDeclaredConstructor
    // 获取某个构造器：只要你敢写，这里就能拿到，无所谓权限是否可及
    @Test
    public void getDeclaredConstructor() {
        Class c = Student.class;
        try {
            Constructor constructor01 = c.getDeclaredConstructor();
            System.out.println(constructor01.getName() + " ---> " + constructor01.getParameterCount());
            Constructor constructor02 = c.getDeclaredConstructor(String.class, int.class, String.class);
            System.out.println(constructor02.getName() + " ---> " + constructor02.getParameterCount());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
