package Demo10;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        //Patient patient = new Patient("Li", "Yiqi", -5, "male", "China", "Good", "2020/8/10", "2020/8/20");
        //public Patient(String givenName, String lastName, int age, String gender,String citizenship, String diagnostic, String inTime, String prevTime)
        //System.out.println(patient.getGivenName());
        //System.out.println(patient.getAge());
        Patient patient = new Patient();
        System.out.println("Please input the age:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        patient.setAge(i);
        System.out.println(patient.getAge());
    }
}
