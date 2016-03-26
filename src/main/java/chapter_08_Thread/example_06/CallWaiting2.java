package chapter_08_Thread.example_06;


import java.util.Calendar;

import static chapter_08_Thread.example_06.Example_11.*;

class CallWaiting2 implements Runnable{

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
                    waitGog= true; // WatchDog => wait

                    Thread.sleep(1000);
                    System.out.printf("         Tellllllllll ");
                    Thread.sleep(1000);

                    time = Calendar.getInstance().getTimeInMillis();

                  notifyAll(); // WatchDog => notify

                }
            } catch (InterruptedException ignored) {
                System.err.println("InterruptedException");
            }
        }
        System.out.printf("   --> End %s \n", Thread.currentThread().getName());
    }

}
