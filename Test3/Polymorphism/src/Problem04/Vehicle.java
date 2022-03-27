package Problem04;

public interface Vehicle {
    public abstract double changeGear(double[] gears);        //how many gears are changed in different parts of a vehicle

    public abstract double checkBreak(double[] breaks);        //how many types of breaks are changed
}