package chapter_08_Thread.example_08_wait_notify;

import java.util.Random;

import static chapter_08_Thread.example_08_wait_notify.StoreBooks.flag;

class Consumer implements Runnable {
    private StoreBooks storeBooks;

    Consumer(StoreBooks storeBooks) {
        this.storeBooks = storeBooks;
    }

    @Override
    public void run() {
        while (flag) {
            try {
                Thread.sleep(new Random().nextInt(2000));
                storeBooks.buyBook();
                System.out.println("     Consumer: " + Thread.currentThread().getName() + "buy book.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
