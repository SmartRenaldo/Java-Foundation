package StudentManagement;

public class Grade {
    private String number;

    public Grade() {
    }

    public Grade(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "number='" + number + '\'' +
                '}';
    }
}
