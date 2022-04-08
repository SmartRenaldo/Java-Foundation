package StudentManagement;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private String gender;
    private String grade;
    private long phone;
    private String email;
    private Date birthday;

    public Student() {
    }

    public Student(int id, String name, String gender, String grade, long phone, String email, Date birthday) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", grade='" + grade + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
