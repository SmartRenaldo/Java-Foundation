public class SparseArray {
    public static void main(String[] args) {
        // 创建一个原始的二维数组 11 * 11
        // 0: 表示没有棋子， 1 表示 黑子 2 表白子
        int[][] chessArray = new int[11][11];
        chessArray[5][5] = 1;
        chessArray[5][4] = 2;
        chessArray[4][4] = 1;
        // 输出原始的二维数组
        System.out.println("Output two-dimensional array:");
        for (int[] rowArray : chessArray) {
            for (int element : rowArray) {
                System.out.printf("%-5d", element);
            }
            System.out.println();
        }

        // 将二维数组转稀疏数组的思路
        // 1. 先遍历二维数组 得到非 0 数据的个数
        int sum = 0;
        for (int[] rowArray : chessArray) {
            for (int i : rowArray) {
                if (i != 0) {
                    sum++;
                }
            }
        }

        // 2. 创建对应的稀疏数组
        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = chessArray.length;
        sparseArray[0][1] = chessArray[0].length;
        sparseArray[0][2] = sum;

        // 遍历二维数组，将非 0 的值存放到 sparseArray 中
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArray[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArray[i][j];
                }
            }
        }

        // 输出稀疏数组
        System.out.println("\nOutput sparse array:");
        for (int[] rows : sparseArray) {
            for (int element : rows) {
                System.out.printf("%-5d", element);
            }
            System.out.println();
        }

        // 将稀疏数组 恢复成 原始的二维数组
        /*
         *  * 1. 先读取稀疏数组的第一行，根据第一行的数据，创建原始的二维数组， 比如上面的 chessArr2 = int[11][11] 2.
         * 再读取稀疏数组后几行的数据，并赋给 原始的二维数组 即可.
         */

        // 1. 先读取稀疏数组的第一行，根据第一行的数据，创建原始的二维数组
        int[][] restoredChessArray = new int[sparseArray[0][0]][sparseArray[0][1]];
        // 2. 再读取稀疏数组后几行的数据(从第二行开始)，并赋给 原始的二维数组 即可
        for (int i = 1; i < sparseArray.length; i++) {
            restoredChessArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        // 输出恢复后的二维数组
        System.out.println("\nRestored two-dimensional array:");
        for (int[] rowArray : restoredChessArray) {
            for (int ele : rowArray) {
                System.out.printf("%-5d", ele);
            }
            System.out.println();
        }
    }
}
