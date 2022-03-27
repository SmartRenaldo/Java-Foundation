package Method6;

public class MaxArray {
    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55, 66};
        int max = getMax(a);
        System.out.println("max = " + max);
    }

    public static int getMax(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
}
