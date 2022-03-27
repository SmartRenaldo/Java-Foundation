package Problem04;

public class Main {
    public static void main(String[] args) {
        //create a new hibrid bicycle
        Bicycle hibridBicycle = new Hibrid();
        //test bicycle.changeGear()
        double gear = hibridBicycle.changeGear(new double[]{0, 1, 1, 2, 0});
        System.out.println("Change gear: " + gear);
        //test checkBreak(new double[]{0, 1, 0})
        double aBreak = hibridBicycle.checkBreak(new double[]{0, 1, 0});
        System.out.println("Check break: " + aBreak);
        System.out.println();

        //create a electric bike
        ElectricBike eBike = new ElectricBike("red", 2015, 36, true, "2020/8/10",
                "2020/8/18", "Change gears; cheak breaks; charge", "Lithium battery");
        //test chargeBike()
        eBike.chargeBike();
        System.out.println("--------------------------");
        //test checkoutService()
        eBike.checkoutService();
    }
}
