package chapter_08_Thread.example_02;

public class Example_03 {

    public static void main(String[] args) {
        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            JThread thread = new JThread("JThread: thread "+i);
            thread.start();
        }
        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }

}
