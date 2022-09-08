package thread;

import java.util.Random;
import java.util.concurrent.Callable;

public class TestThreadThree implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}
