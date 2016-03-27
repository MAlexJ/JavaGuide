package chapter_08_Thread.example_08_wait_notify;

public class Example_13 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(">>>>>> Run <<<<<<<<<<");

        StoreBooks store = new StoreBooks();

        Producer producer = new Producer(store);
        Consumer consumer1 = new Consumer(store);
        Consumer consumer2 = new Consumer(store);
        Consumer consumer3 = new Consumer(store);

        Thread threadProducer = new Thread(producer, "Producer");
        threadProducer.start();

        new Thread(consumer1, "Consumer_1").start();
        new Thread(consumer2, "Consumer_2").start();
        new Thread(consumer3, "Consumer_3").start();

        threadProducer.join();

        System.out.println(">>>>>> Exit <<<<<<<<<<");
    }

}
