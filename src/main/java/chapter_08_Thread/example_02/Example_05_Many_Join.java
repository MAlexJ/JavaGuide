package chapter_08_Thread.example_02;

public class Example_05_Many_Join {

    public static void main(String[] args) throws InterruptedException {
        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            JThread thread = new JThread("JThread: thread "+i);
            thread.start();
            thread.join();
        }
        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }

}
