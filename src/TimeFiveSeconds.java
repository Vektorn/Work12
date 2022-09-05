import java.util.concurrent.Exchanger;

public class TimeFiveSeconds extends Thread {
    public Exchanger<Long> t;
    public TimeFiveSeconds(Exchanger<Long> exchanger) {
        this.t = exchanger;
    }
    @Override
    public void run() {
        long time ;
        try {
            while (true){
                time = t.exchange(0L);
                if (time % 5 == 0 && time !=0) {
                    System.out.println("Пройшло 5 секунд");
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
