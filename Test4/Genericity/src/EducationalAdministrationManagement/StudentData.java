package EducationalAdministrationManagement;

public class StudentData implements Data<Student>{

    @Override
    public void add(Student student) {
        System.out.println("Add student!");
    }

    @Override
    public void delete(Student student) {
        System.out.println("Delete student!");
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student query(int num) {
        return null;
    }
}
