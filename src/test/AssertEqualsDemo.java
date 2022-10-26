package test;

import bookstore.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AssertEqualsDemo {

    @Test
    void assertEqualsWithNoMessage(){

        BookService bookService=new BookService();

        Book Java=new Book("1","Java","James Gosling");
        Book Python=new Book("2","Python","Trovas Gordon");

        bookService.addBook(Java);
        bookService.addBook(Python);

        Book actualBook = bookService.getBookById("1");

       assertEquals("1",actualBook.getBookId());
       assertEquals("Java",actualBook.getTitle());
    }

    @Test
    void assertEqualsWithMessage(){

        BookService bookService=new BookService();

        Book Java=new Book("1","Java","James Gosling");
        Book Python=new Book("2","Python","Trovas Gordon");

        bookService.addBook(Java);
        bookService.addBook(Python);

        Book actualBook = bookService.getBookById("1");


        assertEquals("1",actualBook.getBookId());
        assertEquals("Python",actualBook.getTitle(),"Book title didn't match!");
    }



    @Test
    void assertEqualsWithMessageSupplier(){

        BookService bookService=new BookService();

        Book Java=new Book("1","Java","James Gosling");
        Book Python=new Book("2","Python","Trovas Gordon");

        bookService.addBook(Java);
        bookService.addBook(Python);

        Book actualBook = bookService.getBookById("1");


        assertEquals("1",actualBook.getBookId());
        assertEquals("Java",actualBook.getTitle(),()->"Book title didn't match!");
    }

}
