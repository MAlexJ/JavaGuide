package chapter_08_Thread.example_05_synchronized;

public class Example_09 {

    public static void main(String[] args) {

        CommonResource commonResource = new CommonResource();
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new MyRunnable(commonResource));
            t.setName("Поток " + i);
            t.start();
        }
    }

}


class CommonResource {
    int x = 1;
}

class MyRunnable implements Runnable {

    private CommonResource resource;

    MyRunnable(CommonResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.printf("%s %d \n", Thread.currentThread().getName(), resource.x);
            resource.x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
