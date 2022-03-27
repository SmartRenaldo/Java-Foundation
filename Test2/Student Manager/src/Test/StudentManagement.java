package Test;

import Domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private final static Scanner SYS_SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> stds = new ArrayList<>();

        lo:
        while (true) {
            System.out.println("Welcome to student management system");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Modify student");
            System.out.println("4. Query student");
            System.out.println("5. Exit");
            System.out.println("Please enter your option:");

            String choice = scanner.next();
            switch (choice) {
                case "1":
                    addStudents(stds);
                    break;
                case "2":
                    removeStudents(stds);
                    break;
                case "3":
                    updateStudents(stds);
                    break;
                case "4":
                    queryStudents(stds);
                    break;
                case "5":
                    System.out.println("Thanks for your using!");
                    break lo;
                default:
                    System.out.println("The data you entered is incorrect. Please re-enter.");
                    break;
            }
        }
        SYS_SCANNER.close();
    }

    public static void addStudents(ArrayList<Student> stds) {
        String stdID;
        while (true) {
            System.out.println("Please enter student ID:");
            stdID = SYS_SCANNER.next();
            int index = getStudent(stds, stdID);
            if (index == -1) {
                break;
            }
            System.err.println("The student number already exists. Please re-enter");
        }
        System.out.println("Please enter the name:");
        String stdName = SYS_SCANNER.next();
        System.out.println("Please enter the age:");
        int stdAge = SYS_SCANNER.nextInt();
        System.out.println("Please enter the birthday:");
        String stdBirthday = SYS_SCANNER.next();
        Student std = new Student(stdID, stdName, stdAge, stdBirthday);
        stds.add(std);
        System.out.println("Entered successfully");
    }

    public static void queryStudents(ArrayList<Student> stds) {
        if (stds.size() == 0) {
            System.err.println("No information! Please add information before querying.");
            return;
        }
        System.out.println("Student ID\tName\tAge\tBitthday");
        for (Student std : stds) {
            System.out.println(std.getSId() + "\t\t" + std.getName() + "\t" + std.getAge() + "\t" + std.getBirthday());
        }
    }

    private static int getStudent(ArrayList<Student> list, String sId) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student std = list.get(i);
            String id = std.getSId();
            if (sId.equals(id)) {
                return i;
            }
        }
        return index;
    }

    public static void updateStudents(ArrayList<Student> stds) {
        System.out.println("Please enter the student ID of the student you want to update");
        String updateSId = SYS_SCANNER.next();
        int index = getStudent(stds, updateSId);
        if (index == -1) {
            System.err.println("No such person was found!");
            return;
        }
        System.out.println("Please enter the student name");
        String name = SYS_SCANNER.next();
        System.out.println("Please enter the student age");
        int age = SYS_SCANNER.nextInt();
        System.out.println("Please enter the student birthday");
        String birthday = SYS_SCANNER.next();
        Student std = new Student(updateSId, name, age, birthday);
        stds.set(index, std);
        System.out.println("Update successfully");
    }

    public static void removeStudents(ArrayList<Student> stds) {
        System.out.println("Please enter the student ID of the student you want to delete");
        String deleteSid = SYS_SCANNER.next();
        int index = getStudent(stds, deleteSid);
        if (index == -1) {
            System.err.println("No such person was found!");
            return;
        }
        stds.remove(index);
        System.out.println("Remove successfully");
    }
}
