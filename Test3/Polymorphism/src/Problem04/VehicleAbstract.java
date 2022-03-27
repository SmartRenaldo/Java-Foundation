package Problem04;

public abstract class VehicleAbstract{
    //attributes
    private String color;
    private int year;
    private int numberGears;

    //default constructor
    public VehicleAbstract() {
    }

    //parametric constructor
    public VehicleAbstract(String color, int year, int numberGears) {
        this.color = color;
        this.year = year;
        this.numberGears = numberGears;
    }

    //accessor
    public String getColor() {
        return color;
    }

    //mutator
    public void setColor(String color) {
        this.color = color;
    }

    //accessor
    public int getYear() {
        return year;
    }

    //mutator
    public void setYear(int year) {
        this.year = year;
    }

    //accessor
    public int getNumberGears() {
        return numberGears;
    }

    //mutator
    public void setNumberGears(int numberGears) {
        this.numberGears = numberGears;
    }
}
