package singleton;

public class BookStore {

    public static void main(String[] args) {
        BooksLog log = BooksLog.getInstance();
        log.takeBook("Book1", "123");

        BooksLog log2 = BooksLog.getInstance();
        log2.returnBook("Book1", "123");

        log2.printLog();
    }
}
