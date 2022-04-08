package StudentManagement;

import java.util.Date;
import java.util.List;

public class StudentService {
    StudentDAO studentDAO = new StudentDAO();

    /**
     * count the number of students
     *
     * @return number of students
     */
    public Long countStd() {
        return (Long) studentDAO.scalar("select count(*) from students");
    }

    /**
     * view student list
     *
     * @return student list
     */
    public List<Student> checkStd() {
        return studentDAO.queryMulti("select * from students", Student.class);
    }

    /**
     * check a student by id
     *
     * @param id
     * @return a student
     */
    public Student checkStdById(int id) {
        return studentDAO.querySingle("select * from students where id=?", Student.class, id);
    }

    /**
     * check a student/student list by name
     *
     * @param name
     * @return student list
     */
    public List<Student> checkStdByName(String name) {
        return studentDAO.queryMulti("select * from students where name=?", Student.class, name);
    }

    /**
     * modify birthday by id
     *
     * @param id
     * @param date
     * @return true: modified; false: failed
     */
    public boolean modifyBirthday(int id, Date date) {
        return studentDAO.update("update students set birthday=? where id=?", date, id) > 0;
    }

    /**
     * delete a student by id
     *
     * @param id
     * @return true: deleted; false: failed
     */
    public boolean deleteStd(int id) {
        return studentDAO.update("delete from students where id=?", id) > 0;
    }
}
