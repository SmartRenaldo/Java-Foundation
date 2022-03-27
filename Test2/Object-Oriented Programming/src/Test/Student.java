package Test;

/*
JavaBean: Encapsulation
 */
public class Student {
    private String name;
    private int age;
    private String favBook;

    public Student() {
    }

    public Student(String name, int age, String favBook) {
        this.name = name;
        this.age = age;
        this.favBook = favBook;
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

    public String getFavBook() {
        return favBook;
    }

    public void setFavBook(String favBook) {
        this.favBook = favBook;
    }

    public void show(String name, int age, String favBook) {
        System.out.println("Hello! Everyone!");
        System.out.println("My name is " + name);
        System.out.println("I'm " + age + " years old.");
        System.out.println("My favorate book is " + favBook);
    }

    public void show(){
        System.out.println("Hello! Everyone!");
        System.out.println("My name is " + name);
        System.out.println("I'm " + age + " years old.");
        System.out.println("My favorate book is " + favBook);
    }
}
