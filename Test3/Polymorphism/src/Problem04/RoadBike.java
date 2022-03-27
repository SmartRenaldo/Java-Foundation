package Problem04;

public class RoadBike extends Bicycle {
    //attribute
    private String tyres;

    //default constructor
    public RoadBike() {
    }

    //parametric constructor
    public RoadBike(String color, int year, int numberGears, boolean is_serviced, String inDate,
                    String outDate, String serviceResponsible, String tyres) {
        super(color, year, numberGears, is_serviced, inDate, outDate, serviceResponsible);
        this.tyres = tyres;
    }

    @Override
    public void checkoutService() {
        super.checkoutService();
        System.out.println("Tyres: " + tyres);
    }

    //accessor
    public String getTyres() {
        return tyres;
    }

    //mutator
    public void setTyres(String tyres) {
        this.tyres = tyres;
    }
}
