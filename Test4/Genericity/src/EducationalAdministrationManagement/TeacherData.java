package EducationalAdministrationManagement;

public class TeacherData implements Data<Teacher>{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Add teacher!");
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("Delete teacher!");
    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public Teacher query(int num) {
        return null;
    }
}
