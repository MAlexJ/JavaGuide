package chapter_08_Thread.example_04;

import java.util.Calendar;

import static chapter_08_Thread.example_04.Example_08.stop;
import static chapter_08_Thread.example_04.Example_08.time;

class CallWaiting implements Runnable {

    private int count;

    @Override
    public void run() {
        System.out.printf("   --> Start %s \n", Thread.currentThread().getName());

        while (stop) {
            try {
                Thread.sleep(500);
                System.out.printf("   --> Waining call, cycle number: %s \n", ++count);
                Thread.sleep(500);

                if (count == 19) {
                    time = Calendar.getInstance().getTimeInMillis();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("   --> End %s \n", Thread.currentThread().getName());
    }
}
