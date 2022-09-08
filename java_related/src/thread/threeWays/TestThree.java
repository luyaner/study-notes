package thread.threeWays;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestThree {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestThreadThree threadThree = new TestThreadThree();
        // Callable -> FutureTask
        FutureTask<Integer> futureTask = new FutureTask<>(threadThree);
        // 启动子线程
        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println(futureTask.isDone());
        // 注意！Callable线程被启动后，需要手动获取task的返回值
        Integer result = futureTask.get();
        System.out.println(result);
        // 此时线程也随之结束
        System.out.println(futureTask.isDone());
    }
}
