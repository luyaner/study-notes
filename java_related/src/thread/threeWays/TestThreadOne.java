package thread.threeWays;

public class TestThreadOne extends Thread {

    public void run() {
        // 线程体
        for (int i = 1; i < 10; i++) {
            System.out.println("TestThread---- " + i);
        }
    }
}

