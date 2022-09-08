package Task2;

public class D extends Thread {
    private int i;
    public D(int i) {
        this.i = i;
    }
    @Override
    synchronized public void run() {
        Programa.number(i);
    }
}
