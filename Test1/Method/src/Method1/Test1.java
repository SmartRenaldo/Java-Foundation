package Method1;

public class Test1 {
    /*
method definition format
    public static void name_of_method(){
        body
    }

format of method of calling
    name_of_method();
 */
    public static void main(String[] args) {
        eat();
        study();
    }

    public static void eat() {
        System.out.println("eatttttttt");
    }
    public static void study(){
        eat();
        System.out.println("studyyyyyyy");
    }
    public static void cat(){
        System.out.println("cattttttt");

    }

}
