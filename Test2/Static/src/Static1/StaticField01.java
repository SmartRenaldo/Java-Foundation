package Static1;

import Domain.Student;

public class StaticField01 {
    //如果一个成员变量使用了static关键字,那么这个变量不在属于对象自己,而是属于所在的类,多个对象共享同一份数据。
    public static void main(String[] args) {
/*
        Student std1 = new Student("Job", 22);
        std1.setRoom("5F205");
        System.out.println("Name: " + std1.getName() + ", Age: " + std1.getAge()
                + ", Room: " + std1.getRoom());
        Student std2 = new Student("Pate", 19);
        System.out.println("Name: " + std2.getName() + ", Age: " + std2.getAge()
                + ", Room: " + std2.getRoom());
*/
        Student.setRoom("5F205");

        Student std1 = new Student("Job", 22);

        Student std2 = new Student("Pate", 19);
        System.out.println("Name: " + std2.getName() + ", Age: " + std2.getAge()
                + ", Room: " + Student.getRoom() + ", ID: " + std2.getId());
        System.out.println("Name: " + std1.getName() + ", Age: " + std1.getAge()
                + ", Room: " + Student.getRoom() + ", ID: " + std1.getId());

        Student std3 = new Student();
        System.out.println("Name: " + std3.getName() + ", Age: " + std3.getAge()
                + ", Room: " + Student.getRoom() + ", ID: " + std3.getId());
    }
}
