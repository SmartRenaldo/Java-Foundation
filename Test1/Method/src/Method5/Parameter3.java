package Method5;

public class Parameter3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        change(arr);
        System.out.println(arr[1]);
    }
    public static void change(int[] arr){
        arr[1] = 200;
    }
}
