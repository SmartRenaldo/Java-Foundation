package _07TCP通信四;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class HandleSocketThreadPool {
    private ThreadPoolExecutor executor;

    /*    public ThreadPoolExecutor(int corePoolSize,
                                  int maximumPoolSize,
                                  long keepAliveTime,
                                  TimeUnit unit,
                                  BlockingQueue<Runnable> workQueue) {
            this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
                    Executors.defaultThreadFactory(), defaultHandler);
        }*/
    public HandleSocketThreadPool(int corePoolSize, int queueSize) {
        this.executor = new ThreadPoolExecutor(corePoolSize,
                corePoolSize, 120L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(queueSize));
    }

    public void execute(Runnable task) {
        this.executor.execute(task);
    }
}
