package _06方法引用方式一_静态方法的引用;

public class Student2 {
    private String name;
    private int age;
    private char sex;

    public static int SortByAge(Student2 o1, Student2 o2) {
        return o1.getAge() - o2.getAge();
    }

    public Student2() {
    }

    public Student2(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
