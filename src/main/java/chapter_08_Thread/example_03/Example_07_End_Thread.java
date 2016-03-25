package chapter_08_Thread.example_03;

public class Example_07_End_Thread {

    public static void main(String[] args) {

        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());

        MyThRunnable myThRunnable = new MyThRunnable();
        Thread thread = new Thread(myThRunnable, "MyThRunnable");
        thread.start();

        try {
            Thread.sleep(2300);

            myThRunnable.disable();

            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }

}
