package ArrayList2;

import Domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class InputStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student std1 = getStudent();
        Student std2 = getStudent();
        Student std3 = getStudent();
        students.add(std1);
        students.add(std2);
        students.add(std3);

        for (Student std : students) {
            System.out.println(std.getName());
            System.out.println(std.getAge());
        }
    }

    public static Student getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name:");
        String name = sc.next();
        System.out.println("Please enter the age:");
        int age = sc.nextInt();
        return new Student(name, age);
    }
}
