package thread;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("main-1---- " + i);
        }

        // 从子线程被开启时，多线程就出现了，cpu资源开始被争夺
        Thread thread = new TestThreadOne();
        thread.start(); //调用start方法以调用我们覆写的run方法，启动线程

        for (int i = 1; i < 10; i++) {
            System.out.println("main-2---- " + i);
        }
    }
}
