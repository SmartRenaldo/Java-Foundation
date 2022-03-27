package Laptop;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

/*        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);       //right     Keyboard --> USB*/

        computer.useDevice(new Mouse());
        computer.useDevice(new Keyboard());

        computer.powerOff();
    }
}
