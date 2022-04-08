package _21递归的概述和应用理论;

/**
 * 啤酒问题：（作业）
 * 啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶
 * ，问10元可以喝多少瓶，剩余多少盖子和瓶子！！
 */

public class Beer {
    private static int totalBeerNum;
    private static int leftLidNum;
    private static int leftBottleNum;

    public static void main(String[] args) {
        buyBeer(10);
        System.out.println("One can drink " + totalBeerNum + " bottles of beer");
        if (leftLidNum == 1) {
            System.out.println(leftLidNum + " lid left");
        } else {
            System.out.println(leftLidNum + " lids left");
        }
        System.out.println(leftBottleNum + " bottle left");
    }

    /**
     * @param money: money to buy beer
     */
    private static void buyBeer(int money) {
        //拿钱买酒
        int num = money / 2;
        totalBeerNum += num;

        // 算出当前剩余的全部盖子和瓶子数，换算成金额继续购买
        int currentLidNum = leftLidNum + num;
        int currentBottleNum = leftBottleNum + num;
        int currentMoney = (currentLidNum / 4) * 2 + (currentBottleNum / 2) * 2;
        leftLidNum = currentLidNum % 4;
        leftBottleNum = currentBottleNum % 2;

        if (currentMoney >= 2) {
            buyBeer(currentMoney);
        }
    }
}
