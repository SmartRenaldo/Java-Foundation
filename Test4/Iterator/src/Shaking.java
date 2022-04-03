import java.util.Random;

public class Shaking {

    private int nCouples;

    //accessor and mutator
    public int getnCouples() {
        return nCouples;
    }

    public void setnCouples(int nCouples) {
        this.nCouples = nCouples;
    }

    //randomly generate the number of couple in the party
    public Shaking() {
        super();
        Random random = new Random();
        nCouples = random.nextInt(100);
        System.out.println("The number of Party members is: " + nCouples);
        System.out.println("The total number of handshakes is: " + countHandShakes(nCouples));
    }

    //parametric constructor

    public int countHandShakes(int n) {
        if (n <= 2) {
            System.out.println("Wrong input! Program exit!");
            System.exit(0);
            return 0;
        }
        int flag = n;
        if (flag > 1) {
            flag--;
            return 2 * (n - 1) + countHandShakes(n - 1);
        }
            return n - 2;
    }

    /**
     *
     */
    public Shaking(int nCouples) {
        super();
        this.nCouples = nCouples;
        System.out.println("The number of Party members is: " + nCouples);
        System.out.println("The total number of handshakes is: " + countHandShakes(nCouples));
    }
}

