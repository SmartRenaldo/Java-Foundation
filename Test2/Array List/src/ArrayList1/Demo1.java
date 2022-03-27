package ArrayList1;

import Domain.Student;

public class Demo1 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student std1 = new Student("Bob", 23);
        Student std2 = new Student("Pate", 22);
        Student std3 = new Student("Job", 21);
        arr[0]=std1;
        arr[1]=std2;
        arr[2]=std3;
        for (Student std : arr) {
            System.out.println(std.getName());
            System.out.println(std.getAge());
        }
    }
}
