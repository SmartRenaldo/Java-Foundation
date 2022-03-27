package ArrayList2;

import Domain.Student;

import java.util.ArrayList;

public class Screen {
    public static void main(String[] args) {
        Student std1 = new Student("Bob", 10);
        Student std2 = new Student("Pete", 10);
        Student std3 = new Student("Cathe", 20);
        ArrayList<Student> list = new ArrayList<>();
        list.add(std1);
        list.add(std2);
        list.add(std3);
        ArrayList<Student> newList = screenList(list);
        for (Student student : newList) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }
    }

    public static ArrayList<Student> screenList(ArrayList<Student> list){
        ArrayList<Student> newList = new ArrayList<>();
        for (Student std : list) {
            if(std.getAge() < 18){
                newList.add(std);
            }
        }

        return newList;
    }
}
