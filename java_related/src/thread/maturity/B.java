package thread.maturity;

public class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[" + i +"] " + this.getName() + ": priority " + getPriority());
        }
    }
}
