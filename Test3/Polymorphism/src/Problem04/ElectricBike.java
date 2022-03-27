package Problem04;

public class ElectricBike extends Bicycle {
    //attribute
    private String battery;

    //member method
    public void chargeBike() {
        System.out.println("Fully charged");
    }

    //default constructor
    public ElectricBike() {
    }

    //parametric constructor
    public ElectricBike(String color, int year, int numberGears, boolean is_serviced,
                        String inDate, String outDate, String serviceResponsible, String battery) {
        super(color, year, numberGears, is_serviced, inDate, outDate, serviceResponsible);
        this.battery = battery;
    }

    @Override
    public void checkoutService() {
        super.checkoutService();
        System.out.println("Battery: " + battery);
    }

    //accessor
    public String getBattery() {
        return battery;
    }

    //mutator
    public void setBattery(String battery) {
        this.battery = battery;
    }
}
