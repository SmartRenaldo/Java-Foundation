package Private2;

public class TestStudent {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Catherine");
        std.setAge(18);
        std.setFavBook("HP");
        System.out.println(std.getName());
        for (int i = 0; i < std.getAge(); i++) {
            System.out.println("Awesome!");
        }
        System.out.println();
        std.show();
    }
}
