package homework_06;

import java.util.Objects;

/**
 * 7. 案例07：反射案例6
 * 7.1 需求说明
 * 1. 定义一个Person类，包含属性name、age。
 * 2. 使用反射的方式创建一个实例、调用构造函数初始化name、age。使用反射方式调用setName方法对姓名进
 * 行设置，不使用setAge方法直接使用反射方式对age赋值。
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
