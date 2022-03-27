package Problem04;

public class Bicycle extends VehicleAbstract implements Vehicle {
    //attributes
    private boolean is_serviced;
    private String inDate;
    private String outDate;
    private String serviceResponsible;

    //defalut constructor
    public Bicycle() {
    }

    //parametric constructor
    public Bicycle(String color, int year, int numberGears, boolean is_serviced,
                   String inDate, String outDate, String serviceResponsible) {
        super(color, year, numberGears);
        this.is_serviced = is_serviced;
        this.inDate = inDate;
        this.outDate = outDate;
        this.serviceResponsible = serviceResponsible;
    }

    @Override
    public double changeGear(double[] gears) {
        double sum = 0;
        for (double gear : gears) {
            sum += gear;
        }
        return sum;         //how many gears are changed in different parts of a bicycle
    }

    @Override
    public double checkBreak(double[] breaks) {
        double sum = 0;
        for (double aBreak : breaks) {
            sum += aBreak;
        }
        return sum;         //how many types of breaks are changed
    }

    //method
    public void checkoutService() {
        System.out.println("Color: " + super.getColor());
        System.out.println("Delivery year: " + super.getYear());
        System.out.println("Number of gears: " + super.getNumberGears());
        System.out.println("Serviced: " + is_serviced);
        System.out.println("In date: " + inDate);
        System.out.println("Out date: " + outDate);
        System.out.println("Service: " + serviceResponsible);
    }

    public boolean isIs_serviced() {
        return is_serviced;
    }

    //mutator
    public void setIs_serviced(boolean is_serviced) {
        this.is_serviced = is_serviced;
    }

    //accessor
    public String getInDate() {
        return inDate;
    }

    //mutator
    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    //accessor
    public String getOutDate() {
        return outDate;
    }

    //mutator
    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    //accessor
    public String getServiceResponsible() {
        return serviceResponsible;
    }

    //mutator
    public void setServiceResponsible(String serviceResponsible) {
        this.serviceResponsible = serviceResponsible;
    }

}
