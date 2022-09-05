import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.Exchanger;

public class TimeMain {
    private static long beginTime = 0;

    public static void main(String[] args) {
        beginTime = System.nanoTime();
        System.out.println("Запуск програми в : "
                            +(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime())));
        Exchanger<Long> exchanger = new Exchanger<>();

        TimeBegin timeBegin = new TimeBegin(beginTime, exchanger);
        timeBegin.start();

        TimeFiveSeconds timeFiveSeconds = new TimeFiveSeconds( exchanger);
        timeFiveSeconds.start();
    }
}
