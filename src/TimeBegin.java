import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
public class TimeBegin extends Thread {
    private long beginTime;
    public Exchanger<Long> t;
    Long timeNow = 0L;
    public TimeBegin(long beginTime, Exchanger<Long> exchanger) {
        this.beginTime = beginTime;
        this.t = exchanger;
    }
    @Override
    public void run() {
        try {
            while (true)
            {
                timeNow = TimeUnit.NANOSECONDS.toSeconds((System.nanoTime() - beginTime));
                System.out.println("Час від запуску програми : "
                        + timeNow
                        + " секунд "
                        + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
                t.exchange(timeNow);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}