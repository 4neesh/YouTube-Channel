import java.util.Set;

public class BookManager {

    private BooksRepository booksRepository;

    public BookManager(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public Integer getBookInventoryCount(){

        Set<String> allBooks = booksRepository.getBooks();
        return allBooks.size();
    }

    public void addBook(String bookName){
         this.booksRepository.addBook(bookName);
    }
}
