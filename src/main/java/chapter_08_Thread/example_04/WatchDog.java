package chapter_08_Thread.example_04;

import java.util.Calendar;
import static chapter_08_Thread.example_04.Example_08.currentTime;
import static chapter_08_Thread.example_04.Example_08.time;
import static chapter_08_Thread.example_04.Example_08.stop;

class WatchDog implements Runnable {

    @Override
    public void run() {
        System.out.printf("        -->> Поток %s начал работу... \n", Thread.currentThread().getName());
        time = Calendar.getInstance().getTimeInMillis();

        while (stop) {
            currentTime = Calendar.getInstance().getTimeInMillis() - time;
            System.out.printf("        --> currentTime: %s \n", currentTime);
            if (currentTime >= 20000) {
                System.out.println("        --> End this WatchDog: currentTime: " + currentTime);
                stop = false;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("        -->> Поток %s завершил работу... \n", Thread.currentThread().getName());
    }
}
