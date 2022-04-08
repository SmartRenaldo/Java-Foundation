package homework;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 使用线程池,分别开启三条线程,生成10个1到100的随机数,然后计算他们的平均数,
 * 最后计算这三个平均数的平均数.(使用Callable)
 */
public class Test03 {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        FutureTask<Double> task01 = new FutureTask<>(randomNumber);
        FutureTask<Double> task02 = new FutureTask<>(randomNumber);
        FutureTask<Double> task03 = new FutureTask<>(randomNumber);
        Thread thread01 = new Thread(task01);
        Thread thread02 = new Thread(task02);
        Thread thread03 = new Thread(task03);
        thread01.start();
        thread02.start();
        thread03.start();

        try {
            Double double01 = task01.get();
            Double double02 = task02.get();
            Double double03 = task03.get();
            double avg = (double01 + double02 + double03) / 3;
            System.out.printf("Average number of these threads is %.2f\n", avg);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class RandomNumber implements Callable<Double> {
    Random random = new Random();

    @Override
    public Double call() throws Exception {
        double tmp = 0;
        BigDecimal avgBD = new BigDecimal(0);
        double avg = 0;
        for (int i = 0; i < 10; i++) {
            tmp = random.nextInt(100) + 1;
            BigDecimal divisionResult = new BigDecimal(tmp).divide(BigDecimal.valueOf(10));
            avgBD = avgBD.add(divisionResult);
        }
        avg = avgBD.doubleValue();

        System.out.println("Sum of " + Thread.currentThread().getName() + " is " + avg);

        return avg;
    }
}
