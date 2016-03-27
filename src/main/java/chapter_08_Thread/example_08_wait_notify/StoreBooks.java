package chapter_08_Thread.example_08_wait_notify;

import java.util.LinkedList;

class StoreBooks {
    static volatile boolean flag = true;
    private LinkedList<Book> books;

    StoreBooks() {
        this.books = new LinkedList<>();
    }

    synchronized void addBook(Book book) {
        if (this.books.size() > 5) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        this.books.add(book);
        notify();
    }

    synchronized void buyBook() {
        if(this.books.size() < 1){
            try {
                notify();
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        this.books.removeLast();
    }


}
