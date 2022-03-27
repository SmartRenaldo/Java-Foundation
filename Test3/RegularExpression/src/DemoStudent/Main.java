package DemoStudent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//对学生平均分从高到低进行排序；若平均分相同，则按物理成绩；若物理成绩相同，则按化学成绩；若化学成绩相同，则按数学成绩
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //relative path
        Student[] students = readData("RegularExpression/src/DemoStudent/*students");
        new Student().sortStudents(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    private static Student[] readData(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        //get line number
        int lineNum = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            lineNum++;
        }
        Student[] students = new Student[lineNum];

        //reinitialise
        sc = new Scanner(file);
        int i = 0;
        while (sc.hasNextLine()) {
            //get name
            String s = sc.nextLine();
            String nameRegex = "[A-Z][a-z]{1,15}";
            Pattern namePattern = Pattern.compile(nameRegex);
            Matcher nameMatcher = namePattern.matcher(s);
            String name = "";
            while (nameMatcher.find()) {
                name = nameMatcher.group();
            }

            //get grades of physic, chemistry, math
            String markRegex = "\\d{1,3}";
            Pattern markPattern = Pattern.compile(markRegex);
            Matcher markMatcher = markPattern.matcher(s);
            List<String> markList= new ArrayList<>();
            while (markMatcher.find()) {
                markList.add(markMatcher.group());      //store marks to markList
            }
            String physicStr = markList.get(0);
            int physic = Integer.parseInt(physicStr);
            String chemistryStr = markList.get(1);
            int chemistry = Integer.parseInt(chemistryStr);
            String mathStr = markList.get(2);
            int math = Integer.parseInt(mathStr);
            students[i] = new Student(name, physic, chemistry, math);

            i++;
        }
        return students;
    }
}
