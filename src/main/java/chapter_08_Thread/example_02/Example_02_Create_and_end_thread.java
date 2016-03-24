package chapter_08_Thread.example_02;

public class Example_02_Create_and_end_thread {

    public static void main(String[] args) {
        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());

        JThread thread = new JThread("JThread: thread");
        thread.start();

        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }

}
