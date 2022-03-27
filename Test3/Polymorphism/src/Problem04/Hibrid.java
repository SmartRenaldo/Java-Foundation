package Problem04;

public class Hibrid extends Bicycle {
    //attribute
    private String suspension;

    //default constructor
    public Hibrid() {
    }

    //parametric constructor
    public Hibrid(String color, int year, int numberGears, boolean is_serviced, String inDate,
                  String outDate, String serviceResponsible, String suspension) {
        super(color, year, numberGears, is_serviced, inDate, outDate, serviceResponsible);
        this.suspension = suspension;
    }

    @Override
    public void checkoutService() {
        super.checkoutService();
        System.out.println("Suspension: " + suspension);
    }

    //accessor
    public String getSuspension() {
        return suspension;
    }

    //mutator
    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }
}
