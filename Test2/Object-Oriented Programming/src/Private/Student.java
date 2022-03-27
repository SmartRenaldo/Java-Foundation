package Private;

public class Student {
    String name;
    private int age;

    //set value
    public void setAge(int a) {
        if (a >= 0 && a <= 120) {
            this.age = a;
        }else{
            System.err.println("The age is incorrect!");
        }
    }

    //get value
    public int getAge() {
        return age;
    }

    String FavBook;

    public void show() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(FavBook);
    }
}
