package Insert;

public class Main {
    public static void main(String[] args) {
        System.out.println(mystery(4));
    }
    static int mystery(int n){
        if ( n<=1 ){
            return n;
        }
        return 2*mystery(n-1) - mystery(n-2);
    }
}
