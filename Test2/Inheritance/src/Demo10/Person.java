package Demo10;

import java.util.Scanner;

public class Person {
    //attributes
    private String givenName;
    private String lastName;
    private int age;
    private String gender;
    private String citizenship;

    //Basic Constructor
    public Person() {
    }

    //Parametric Constructor
    public Person(String givenName, String lastName, int age, String gender, String citizenship) {
        this.givenName = givenName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.citizenship = citizenship;
    }

    //Accessor
    public String getGivenName() {
        return givenName;
    }

    //Mutator
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    //Accessor
    public String getLastName() {
        return lastName;
    }

    //Mutator
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Accessor
    public int getAge() {
        return age;
    }

    //Mutator
    public void setAge(int age) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (age >= 0 && age <= 120) {
                this.age = age;
                break;
            }else {
                System.out.println("Age should be greater than or equal to zreo and less than or equal to one hundred and twenty! Please input age again!");
                age = sc.nextInt();
            }
        }
    }

    //Accessor
    public String getGender() {
        return gender;
    }

    //Mutator
    public void setGender(String gender) {
        this.gender = gender;
    }

    //Accessor
    public String getCitizenship() {
        return citizenship;
    }

    //Mutator
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
}
