package chapter_08_Thread.example_05_synchronized;

import static chapter_08_Thread.example_05_synchronized.Example_10.num;

public class Example_10 {
    static int num;

    public static void main(String[] args) {
        Common common = new Common();

        for (int i = 1; i < 4; i++){
            Thread t = new Thread(new MyThreadRun(common));
            t.setName("Поток "+ i);
            t.start();
        }
    }
}

class Common {

}

class MyThreadRun implements Runnable {

    private final Common common;

    MyThreadRun(Common common) {
        this.common = common;
    }

    @Override
    public void run() {
        synchronized (common) {
            num = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), num);
                num++;
                try {
                    Thread.sleep(120);
                } catch (Exception ignored) {
                    //Ignore
                }
            }
        }

    }
}