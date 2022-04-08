package _07序列化;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String loginName;
    private String realName;
    // transient修饰的成员变量，将不参与序列化！
    private transient String password;

    public User() {
    }

    public User(String loginName, String realName, String password) {
        this.loginName = loginName;
        this.realName = realName;
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", realName='" + realName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
