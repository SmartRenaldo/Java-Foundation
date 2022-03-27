package Test;

import Domain.Student;

import java.util.Scanner;

public class TsetStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your name and age:");
        String nameAndAge = sc.nextLine();
        String[] split = nameAndAge.split(",");
/*        Student std = new Student(split[0], split[1]);
        System.out.println(std.getName());
        System.out.println(std.getAge());*/
        System.out.println(new Student(split[0],split[1]));
    }
}
