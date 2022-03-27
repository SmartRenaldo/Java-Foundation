package Domain;

public class Student {
    private String sID;
    private String name;
    private int age;
    private String birthday;

    public Student() {
    }

    public Student(String sID, String name, int age, String birthday) {
        this.sID = sID;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getSId() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
