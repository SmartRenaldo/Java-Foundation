package homework.Test08;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[8];
        students[0] = new Student("zhang", 98.67);
        students[1] = new Student("wang", 56.46);
        students[2] = new Student("liu", 72.35);
        students[3] = new Student("wen", 67.86);
        students[4] = new Student("li", 85.99);
        students[5] = new Student("peng", 79.99);
        students[6] = new Student("yun", 94.24);
        students[7] = new Student("ma", 90.78);

        //Arrays.sort(students, ((o1, o2) -> Double.compare(o1.getScore(),o2.getScore())));
        Arrays.sort(students,Comparator.comparingDouble(Student::getScore));
        System.out.println(Arrays.toString(students));
    }
}