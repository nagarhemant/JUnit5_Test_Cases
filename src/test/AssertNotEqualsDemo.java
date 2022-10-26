package test;

import bookstore.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AssertNotEqualsDemo {

    @Test
    void assertNotEqualsWithNoMessage(){

        BookService bookService=new BookService();

        Book Java=new Book("1","Java","James Gosling");
        Book Python=new Book("2","Python","Trovas Gordon");

        bookService.addBook(Java);
        bookService.addBook(Python);

        Book actualBook = bookService.getBookById("1");

        assertNotEquals("2",actualBook.getBookId());

    }

    @Test
    void assertNotEqualsWithMessage(){

        BookService bookService=new BookService();

        Book Java=new Book("1","Java","James Gosling");
        Book Python=new Book("2","Python","Trovas Gordon");

        bookService.addBook(Java);
        bookService.addBook(Python);

        Book actualBook = bookService.getBookById("1");


        assertNotEquals("6",actualBook.getBookId(),"BookId matches to expected value!");
    }



    @Test
    void assertNotEqualsWithMessageSupplier(){

        BookService bookService=new BookService();

        Book Java=new Book("1","Java","James Gosling");
        Book Python=new Book("2","Python","Trovas Gordon");

        bookService.addBook(Java);
        bookService.addBook(Python);

        Book actualBook = bookService.getBookById("1");


        assertNotEquals("5",actualBook.getBookId(),()->"BookId matches to expected value!");

    }


}
