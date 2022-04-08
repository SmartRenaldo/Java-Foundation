package _08反射有啥用;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String addr;
    private String tel;

    public Student() {
    }

    public Student(String name, int age, String gender, String addr, String tel) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.addr = addr;
        this.tel = tel;
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
