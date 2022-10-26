package test;

import bookstore.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

import static org.junit.jupiter.api.Assertions.assertNull;

public class AssertNullDemo {

    @Test
    void assertNullWithNoMessage(){

        BookService bookService=new BookService();

        Book Java=new Book("1","Java","James Gosling");
        Book Python=new Book("2","Python","Trovas Gordon");

        bookService.addBook(Java);
        bookService.addBook(Python);

        Book actualBook = bookService.getBookById("1");
        assertNull(actualBook);
    }

    @Test
    void assertNullWithMessage(){

        BookService bookService=new BookService();

        Book Java=new Book("1","Java","James Gosling");
        Book Python=new Book("2","Python","Trovas Gordon");

        bookService.addBook(Java);
        bookService.addBook(Python);

        Book actualBook = bookService.getBookById("1");
        assertNull(actualBook, "Book is not null ! ");
    }




}
