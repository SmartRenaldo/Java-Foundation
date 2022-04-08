package StudentManagement;

public class GradeService {
    GradeDAO gradeDAO = new GradeDAO();

    //7、	新增年级记录

    /**
     * insert values into grade
     *
     * @param gradeName
     * @return true: inserted; false: failed
     */
    public boolean addGrade(String gradeName) {
        return gradeDAO.update("insert into grade values(?)", gradeName) > 0;
    }
}
