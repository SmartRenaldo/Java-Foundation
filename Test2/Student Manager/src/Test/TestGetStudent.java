package Test;

import Domain.Student;

import java.util.ArrayList;

public class TestGetStudent {
    public static void main(String[] args) {
        Student std1 = new Student("yiqi001", "Jack", 18, "1999-09-09");
        Student std2 = new Student("yiqi002", "Cathe", 19, "2000-03-03");
        ArrayList<Student> stdList = new ArrayList<>();
        stdList.add(std1);
        stdList.add(std2);
        int index1 = getStudent(stdList, "yiqi001");
        int index2 = getStudent(stdList, "yiqi003");
        System.out.println(index1);
        System.out.println(index2);
    }

    public static int getStudent(ArrayList<Student> list, String sid) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student std = list.get(i);
            String id = std.getSId();
            if (sid.equals(id)) {
                index = i;
            }
        }
        return index;
    }
}
