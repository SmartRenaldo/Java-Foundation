package homework.Test11;

public class Meeting implements Runnable {
    private static int employeeCount = 100;
    private String door;
    private static int employeeNumber;

    @Override
    public void run() {
        //num: number of employees who enter through front/back door only
        int num = 0;
        //编号为2的员工从后门入场! 拿到的双色球彩票号码是:[17, 24, 29, 30, 31, 32, 07]
        while (true) {
            synchronized (this) {
                if (employeeCount > 0) {
                    System.out.println("编号为" + ++employeeNumber + "的员工从" + this.door + "入场! " +
                            "拿到的双色球彩票号码是: " + DoubleColorBallUtil.create());
                    num++;
                    employeeCount--;
                } else {
                    System.out.println("从" + this.door + "入场的员工总共" + num + "位员工");
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Meeting() {
    }

    public Meeting(String door) {
        this.door = door;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Meeting.employeeCount = employeeCount;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public static int getEmployeeNumber() {
        return employeeNumber;
    }

    public static void setEmployeeNumber(int employeeNumber) {
        Meeting.employeeNumber = employeeNumber;
    }
}
