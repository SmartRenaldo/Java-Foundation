public class Demo4 {
    public static void main(String[] args) {
        int[][] arr = {{11,22,33},{44,55,66}};
        for (int[] row : arr) {
            for (int anInt : row) {
                System.out.println(anInt);
            }
        }
    }
}
