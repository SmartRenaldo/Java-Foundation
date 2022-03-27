package Private2;

public class Student {
    private String name;
    private int age;
    private String FavBook;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if (a >= 0 && a <= 120) {
            age = a;
        }else{
            System.err.println("The age is incorrect!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setFavBook(String FB) {
        FavBook = FB;
    }

    public String getFavBook() {
        return FavBook;
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(FavBook);
    }
}