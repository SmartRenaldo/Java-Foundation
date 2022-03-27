package Laptop;

public class Computer {
    public void powerOn(){
        System.out.println("The computer is on");
    }

    public void powerOff(){
        System.out.println("The computer is off");
    }

    public void useDevice(USB usb){
        usb.open();

        mouseOrKeyboard(usb);

        usb.close();
    }

    private void mouseOrKeyboard(USB usb) {
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
    }
}
