package Task2;

public class C extends Thread {
    private int i;
    public C(int i) {
        this.i = i;
    }
    @Override
    synchronized public void run() {
        Programa.fizzbuzz(i);
    }
}
