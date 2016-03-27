package chapter_08_Thread.example_07_wait_notify;

class Store {
    private int product = 0;

    synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        product--;
        System.out.println("   Покупатель " + Thread.currentThread().getName() + " купил 1 товар");
        System.out.println("   Товаров на складе: " + product);
        System.out.println();
        notify();
    }

    synchronized void put() {
        while (product >= 2) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        product++;
        System.out.println("Производитель добавил товар");
        System.out.println("Товаров на складе: " + product);
        System.out.println();
        notify();
    }

}
