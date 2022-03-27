package Test;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Abby");
        s1.setAge(17);
        s1.setFavBook("Harry Potter");
        Student s2 = new Student("Loretta", 20, "The Three Musketeers: One for All!");
        s1.show(s1.getName(), s1.getAge(), s1.getFavBook());
        System.out.println();
        s2.show();
    }
}
