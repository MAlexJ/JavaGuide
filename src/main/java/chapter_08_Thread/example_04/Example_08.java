package chapter_08_Thread.example_04;

public class Example_08 {

    static volatile long currentTime;
    static volatile long time;
    static volatile boolean stop = true;

    public static void main(String[] args) throws InterruptedException {
        // login

        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());

        Thread threadWatchDog = new Thread(new WatchDog(), "WatchDog");
        Thread threadCallWaiting = new Thread(new CallWaiting(), "CallWaiting");
        threadWatchDog.start();
        threadCallWaiting.start();

        threadWatchDog.join();

        System.out.println();
        System.out.println("```````````````````````````````````````````````````");
        System.out.println("currentTime: " + currentTime);
        System.out.println("time: " + time);
        System.out.println("stop: " + stop);

        // logout

        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }

}
