package thread.maturity;

public class TestPriority {
    public static void main(String[] args) {
        A a = new A();
        a.setPriority(8);
        a.start();

        B b = new B();
        b.setPriority(4);
        b.start();
    }
}
