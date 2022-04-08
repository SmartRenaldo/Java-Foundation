public class UserService {
    public String login(String loginName, String password) {
        if ("admin".equals(loginName) && "123456".equals(password)) {
            return "success";
        }
        return "Wrong login name or password";
    }

    public void divide(int a, int b) {
        System.out.println(a / b);
    }
}
