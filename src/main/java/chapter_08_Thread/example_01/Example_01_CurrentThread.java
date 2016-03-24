package chapter_08_Thread.example_01;

public class Example_01_CurrentThread {

    /**
     * Для управления потоком класс Thread предоставляет еще ряд методов. Наиболее используемые из них:
     * <p>
     * - qetName(): возвращает имя потока
     * <p>
     * - setName(String name): устанавливает имя потока
     * <p>
     * - qetPriority(): возвращает приоритет потока
     * <p>
     * - setPriority(int proirity): устанавливает приоритет потока. Приоритет является одним из ключевых факторов для выбора системой потока из кучи потоков для выполнения. В этот метод в качестве параметра передается числовое значение приоритета - от 1 до 10. По умолчанию главному потоку выставляется средний приоритет - 5.
     * <p>
     * - isAlive(): возвращает true, если поток активен
     * <p>
     * - isInterrupted(): возвращает true, если поток был прерван
     * <p>
     * - join(): ожидает завершение потока
     * <p>
     * - run(): определяет точку входа в поток
     * <p>
     * - sleep(): приостанавливает поток на заданное количество миллисекунд
     * <p>
     * - start(): запускает поток, вызывая его метод run()
     */

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("thread.getName(): " + thread.getName());
        System.out.println("thread: " + thread);
        System.out.println("thread.isAlive(): " + thread.isAlive());
        System.out.println("thread.isDaemon(): " + thread.isDaemon());
        System.out.println("thread.isInterrupted():" + thread.isInterrupted());
        System.out.println("thread.getPriority():" + thread.getPriority());
    }
}
