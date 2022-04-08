package homework.Test10;

public class Person {
    private String name;
    private String gender;
    private boolean flag;

    public Person() {
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void print() {
        System.out.println("name: " + this.name + "; gender: " + this.gender);

    }
}
