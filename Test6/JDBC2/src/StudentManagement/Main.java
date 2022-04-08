package StudentManagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final static Scanner SYS_SCANNER = new Scanner(System.in);
    private final static AdminService ADMIN_SERVICE = new AdminService();
    private final static GradeService GRADE_SERVICE = new GradeService();
    private final static StudentService STUDENT_SERVICE = new StudentService();

    public static void main(String[] args) {
        System.out.println("Welcome to the student management system!");

        if (login()) {
            lo:while (true) {
                String option = optionPage();
                switch (option) {
                    case "1":
                        countStd();
                        break;
                    case "2":
                        checkStd();
                        break;
                    case "3":
                        checkStdById();
                        break;
                    case "4":
                        checkStdByName();
                        break;
                    case "5":
                        modifyBirthday();
                        break;
                    case "6":
                        deleteStd();
                        break;
                    case "7":
                        addGrade();
                        break;
                    case "8":
                        break lo;
                    default:
                        System.out.println("Wrong input! Please enter again!");
                        break;
                }
            }
        }
        System.out.println("Thanks for your using");
        SYS_SCANNER.close();
    }

    private static void addGrade() {
        System.out.println("---------Add a grade---------");
        System.out.print("Please enter the grade: ");
        String grade = SYS_SCANNER.next();
        boolean flag = GRADE_SERVICE.addGrade(grade);
        System.out.println(flag ? "modified" : "failed");
    }

    private static void deleteStd() {
        System.out.println("---------Delete a student---------");
        System.out.print("Please enter the id: ");
        int id = SYS_SCANNER.nextInt();
        boolean flag = STUDENT_SERVICE.deleteStd(id);
        System.out.println(flag ? "modified" : "failed");
    }

    private static void modifyBirthday() {
        System.out.println("---------Modify a student's birthday---------");
        System.out.print("Please enter the id: ");
        int id = SYS_SCANNER.nextInt();
        System.out.print("Please enter the birthday: ");
        if (SYS_SCANNER.hasNext("\\d{4}-\\d{2}-\\d{2}")) {
            String birthdayS = SYS_SCANNER.next("\\d{4}-\\d{2}-\\d{2}");
            try {
                Date birthday = new SimpleDateFormat("yyyy-MM-dd").parse(birthdayS);
                boolean flag = STUDENT_SERVICE.modifyBirthday(id, birthday);
                System.out.println(flag ? "modified" : "failed");
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    private static void checkStdByName() {
        System.out.println("---------Check a student (students) by name---------");
        System.out.print("Please enter the name: ");
        String name = SYS_SCANNER.next();
        List<Student> list = STUDENT_SERVICE.checkStdByName(name);
        list.forEach(System.out::println);
    }

    private static void checkStdById() {
        System.out.println("---------Check a student (students) by id---------");
        System.out.print("Please enter the id: ");
        int i = SYS_SCANNER.nextInt();
        Student student = STUDENT_SERVICE.checkStdById(i);
        System.out.println(student);
    }

    private static void checkStd() {
        System.out.println("---------Check student list---------");
        List<Student> list = STUDENT_SERVICE.checkStd();
        list.forEach(System.out::println);
    }

    private static void countStd() {
        System.out.println("---------Query the number of students---------");
        Long countStd = STUDENT_SERVICE.countStd();
        if (countStd == 0) {
            System.out.println("No students found");
        } else if (countStd == 1) {
            System.out.println("1 student found");
        } else {
            System.out.println(countStd + " students found");
        }
    }

    private static String optionPage() {
        System.out.println("1. count the number of students");
        System.out.println("2. view student list");
        System.out.println("3. check a student by id");
        System.out.println("4. check a student(students) by name");
        System.out.println("5. modify a student's birthday ");
        System.out.println("6. delete a student");
        System.out.println("7. add a grade");
        System.out.println("8. exit");
        System.out.print("Please choose from 1 to 8: ");
        return SYS_SCANNER.next();
    }

    private static boolean login() {
        System.out.print("Please enter your username: ");
        String username = SYS_SCANNER.next();
        System.out.print("Please enter your password: ");
        String password = SYS_SCANNER.next();
        boolean login = ADMIN_SERVICE.login(username, password);

        if (login) {
            System.out.println("Logged in");
        } else {
            System.out.println("Login failed");
        }

        return login;
    }
}