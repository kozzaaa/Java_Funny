//Null Name

import java.util.concurrent.TimeUnit;

public class Main {

    public static TimeUnit second = TimeUnit.SECONDS;
    public static Integer sizeTimer = 5;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ladowanie...");
        for (int i = sizeTimer; i > 0; i--) {
            System.out.println(i);
            seconds(sizeTimer);
        }
        System.out.println("Zaladowano projekt <3".replace("<3", "❤"));
    }

    public static void seconds(int time) throws InterruptedException {
        sizeTimer = time;
        second.sleep(time/time);
    }
}
