package thread;

public class TestTwo {
    public static void main(String[] args) {
        // 创建竞争资源的子线程
        TestThreadTwo threadTwo = new TestThreadTwo();
        // 仍然需要通过Thread类的start()方法来启动线程，但是TestThreadTwo并没有继承Thread类
        // 但是TestThreadTwo和Thread 共同实现了Runnable接口，这时需要用有参构造器将两个类关联起来
        Thread thread = new Thread(threadTwo);
        thread.start();

        //竞争资源的主线程
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "----" + i);
        }
    }
}
