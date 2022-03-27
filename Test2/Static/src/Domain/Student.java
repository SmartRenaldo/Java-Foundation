package Domain;

public class Student {
    private String name;
    private int age;
    private static String room;
    private int id;
    private static int idCounter = 0;

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public void method(){
        System.out.println(idCounter);
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public static String getRoom() {
        return room;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
