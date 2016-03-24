package chapter_08_Thread.example_02;

public class Example_06_Runnable {

    public static void main(String[] args) {
        System.out.println("Главный поток начал работу...");
        new Thread(new MyRunnable(), "MyRunnable").start();
        System.out.println("Главный поток завершил работу...");
    }

}
