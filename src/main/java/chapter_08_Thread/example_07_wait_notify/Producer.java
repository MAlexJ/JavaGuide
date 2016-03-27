package chapter_08_Thread.example_07_wait_notify;

class Producer implements Runnable {

    private Store store;

    Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            store.put();
        }
    }
}
