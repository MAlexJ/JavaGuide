package chapter_08_Thread.example_08_wait_notify;

import static chapter_08_Thread.example_08_wait_notify.StoreBooks.flag;

class Producer implements Runnable {
    private StoreBooks storeBooks;
    private int count;


    Producer(StoreBooks storeBooks) {
        this.storeBooks = storeBooks;
    }

    @Override
    public void run() {
        while (flag) {
            this.count++;
            Book book = new Book(count, "Book_" + count, "Title*" + count);
            this.storeBooks.addBook(book);
            System.out.println("Added: " + Thread.currentThread().getName() + ": a book " + book + " in the Store");
            if (count > 15) {
                flag = false;
            }
        }
    }
}
