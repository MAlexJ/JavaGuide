package chapter_08_Thread.example_06;

public class Example_11 {

    static volatile long currentTime;
    static volatile long time;
    static volatile boolean stop = true;
    static volatile boolean waitGog;
    static final Object monitor = new Object();


    public static void main(String[] args) throws InterruptedException {
        // login
        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());

        Thread threadDog = new Thread(new WatchDog2(), "WatchDog2");
        Thread threadCall = new Thread(new CallWaiting2(), "CallWaiting2");

        threadDog.start();
        threadCall.start();


        threadDog.join();

        System.out.println();
        System.out.println("```````````````````````````````````````````````````");
        System.out.println("currentTime: " + currentTime);
        System.out.println("time: " + time);
        System.out.println("stop: " + stop);

        // logout
        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }


}

