package Object2;

public class Phone {
    String brand;
    int price;

    public void call(String name){
        System.out.printf("Call %s\n", name);
        message();
    }
    public void message(){
        System.out.println("Send message");
    }
}
