package chapter_08_Thread.example_07_wait_notify;

class Consumer implements Runnable {

    private Store store;

    Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        for (int i = 0; i < 6; i++) {
            store.get();
        }
    }
}
