package chapter_08_Thread.example_07_wait_notify;

public class Example_12 {

    /**
     * Все эти методы вызываются только из синхронизированного контекста
     *     - синхронизированного блока или метода.
     */

    //    wait(): освобождает монитор и переводит вызывающий
    //            поток в состояние ожидания до тех пор,
    //            пока другой поток не вызовет метод notify()

    //    notify(): продолжает работу потока, у которого ранее был вызван метод wait()

    //    notifyAll(): возобновляет работу всех потоков,
    //                 у которых ранее был вызван метод wait()
    public static void main(String[] args) {
        Store store = new Store();

        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        new Thread(producer, "Producer").start();
        new Thread(consumer, "Consumer").start();
    }
}
