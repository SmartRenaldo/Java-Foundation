package homework_06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class ReflectPerson {
    Person person;
    Class c;

    @BeforeEach
    public void init() {
        person = new Person();
        c = Person.class;
    }

    @Test
    public void reflectSetAge() {
        try {
            Method setAge = c.getDeclaredMethod("setAge", int.class);
            setAge.invoke(person, 15);
            Method getAge = c.getDeclaredMethod("getAge");
            System.out.println("getAge.invoke(person) = " + getAge.invoke(person));
            //每个test不会记录其他test的结果
            System.out.println("person = " + person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void reflectSetName() {
        try {
            Method setName = c.getDeclaredMethod("setName", String.class);
            setName.invoke(person, "Morrison");
            Method getName = c.getDeclaredMethod("getName");
            System.out.println("getName.invoke(person) = " + getName.invoke(person));
            System.out.println("person = " + person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
