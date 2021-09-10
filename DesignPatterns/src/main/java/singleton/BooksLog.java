package singleton;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BooksLog {

    private List<String> log;
    private static BooksLog instance = new BooksLog();

    public static BooksLog getInstance(){
        return instance;
    }
    private BooksLog(){
        this.log = new ArrayList<>();
    }

    public void takeBook(String title, String customerId){
        LocalDateTime time = LocalDateTime.now();
        log.add("WITHDRAW:" + title + " : " + customerId + " : " + time);
    }

    public void returnBook(String title, String customerId){
        LocalDateTime time = LocalDateTime.now();
        log.add("RETURN:" + title + " : " + customerId + " : " +  time);
    }

    public void printLog(){
        for(String row : log){
            System.out.println(row);
        }
    }
}
