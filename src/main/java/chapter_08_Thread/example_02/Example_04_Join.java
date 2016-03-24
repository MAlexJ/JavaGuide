package chapter_08_Thread.example_02;

public class Example_04_Join {

    public static void main(String[] args) throws InterruptedException {
        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());

        JThread thread = new JThread("JThread: thread ");
        thread.start();

        // Метод join() заставляет вызвавший поток
        // ожидать завершения вызываемого потока,
        // для которого и применяется метод join
        thread.join();

        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }
}
