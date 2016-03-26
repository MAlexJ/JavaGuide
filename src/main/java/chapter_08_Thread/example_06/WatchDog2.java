package chapter_08_Thread.example_06;

import java.util.Calendar;

import static chapter_08_Thread.example_06.Example_11.*;

class WatchDog2 implements Runnable {


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
            if (waitGog) {
                waitRun(waitGog);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
                // ignored
            }
        }

        System.out.printf("        -->> Поток %s завершил работу... \n", Thread.currentThread().getName());
    }

    private void waitRun(boolean flag) {
        synchronized (monitor) {
            try {
                wait();
            } catch (InterruptedException ignored) {
                System.err.println("InterruptedException ->");
            }
        }
    }

}
