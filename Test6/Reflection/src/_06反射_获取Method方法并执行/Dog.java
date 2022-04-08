package _06反射_获取Method方法并执行;

public class Dog {
    private String name;
    private int age;
    private static String school;
    private static final String SCHOOL = "Washington";

    public Dog() {
    }

    public void run() {
        System.out.println("Dog run");
    }

    private void eat(String food) {
        System.out.println("Dog eat " + food);
    }

    public Dog(String name, int age) {
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

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Dog.school = school;
    }

    public static String getSCHOOL() {
        return SCHOOL;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
