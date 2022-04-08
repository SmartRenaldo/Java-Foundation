public class Boys {
    private int id;
    private String boyName;
    private int userCP;

    public Boys() {
    }

    public Boys(int id, String boyName, int userCP) {
        this.id = id;
        this.boyName = boyName;
        this.userCP = userCP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoyName() {
        return boyName;
    }

    public void setBoyName(String boyName) {
        this.boyName = boyName;
    }

    public int getUserCP() {
        return userCP;
    }

    public void setUserCP(int userCP) {
        this.userCP = userCP;
    }

    @Override
    public String toString() {
        return "Boys{" +
                "id=" + id +
                ", boyName='" + boyName + '\'' +
                ", userCP=" + userCP +
                '}';
    }
}
