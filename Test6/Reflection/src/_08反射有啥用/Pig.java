package _08反射有啥用;

public class Pig {
    private String name;
    private int age;
    private String gender;
    private double weight;
    private String color;

    public Pig() {
    }

    public Pig(String name, int age, String gender, double weight, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.color = color;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
