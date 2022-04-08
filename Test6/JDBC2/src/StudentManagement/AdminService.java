package StudentManagement;

public class AdminService {
    AdminDAO adminDAO = new AdminDAO();

    /**
     * login method
     *
     * @param username
     * @param password
     * @return true: logged in; false: failed
     */
    public boolean login(String username, String password) {
        return (Long) adminDAO.scalar("select count(*) from admin where user=? and password=?",
                username, password) > 0;
    }
}
