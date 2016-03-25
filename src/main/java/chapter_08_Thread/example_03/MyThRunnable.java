package chapter_08_Thread.example_03;


class MyThRunnable implements Runnable {

    private boolean isActive;

    MyThRunnable() {
        this.isActive = true;
    }

    void disable() {
        this.isActive = false;
    }

    @Override
    public void run() {
        System.out.printf(" -->> Start '%s' thread \n", Thread.currentThread().getName());
        int count = 1;
        while (isActive) {
            System.out.printf("  --> Cycle: %s \n", count++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.printf("!!! Thread %s is interrupted \n", Thread.currentThread().getName());
            }
        }
        System.out.printf(" -->> End '%s' thread \n", Thread.currentThread().getName());
    }
}
