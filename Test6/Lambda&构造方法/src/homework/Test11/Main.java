package homework.Test11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(1);

        pool.submit(new Meeting("前门"));
        pool.submit(new Meeting("后门"));
    }
}
