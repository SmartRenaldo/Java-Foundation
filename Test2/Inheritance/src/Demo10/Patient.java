package Demo10;

public class Patient extends Person{
    //Attributes
    private String diagnostic;
    private String inTime;
    private String prevTime;

    //Basic Constructor
    public Patient() {
    }

    //Parametric Constructor
    public Patient(String givenName, String lastName, int age, String gender,
                   String citizenship, String diagnostic, String inTime, String prevTime) {
        super(givenName, lastName, age, gender, citizenship);
        this.diagnostic = diagnostic;
        this.inTime = inTime;
        this.prevTime = prevTime;
    }

    //Mutator
    public String getDiagnostic() {
        return diagnostic;
    }

    //Accessor
    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    //Mutator
    public String getInTime() {
        return inTime;
    }

    //Accessor
    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    //Mutator
    public String getPrevTime() {
        return prevTime;
    }

    //Accessor
    public void setPrevTime(String prevTime) {
        this.prevTime = prevTime;
    }
}
