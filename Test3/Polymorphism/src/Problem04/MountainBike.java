package Problem04;

public class MountainBike extends Bicycle {
    //attributes
    private String suspension;
    private String forks;

    //default constructor
    public MountainBike() {
    }

    //parametric constructor
    public MountainBike(String color, int year, int numberGears, boolean is_serviced,
                        String inDate, String outDate, String serviceResponsible,
                        String suspension, String forks) {
        super(color, year, numberGears, is_serviced, inDate, outDate, serviceResponsible);
        this.suspension = suspension;
        this.forks = forks;
    }

    @Override
    public void checkoutService() {
        super.checkoutService();
        System.out.println("Suspension: " + suspension);
        System.out.println("Forks: " + forks);
    }

    //accessor
    public String getSuspension() {
        return suspension;
    }

    //mutator
    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    //accessor
    public String getForks() {
        return forks;
    }

    //mutator
    public void setForks(String forks) {
        this.forks = forks;
    }
}
