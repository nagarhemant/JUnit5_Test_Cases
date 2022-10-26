package test;

import bookstore.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueDemo {

    @Test
    void assertTrueWithNoMessage(){
        BookService bookService=new BookService();

        Book FirstManualJavaBook= new Book("1", "First Manual Java", "Ion");

        //bookService.addBook(FirstManualJavaBook);

        List<Book> listOfBooks=bookService.books();

        assertTrue(listOfBooks.isEmpty());

    }

    @Test
    void assertTrueWithMessage(){
        BookService bookService=new BookService();

        Book FirstManualJavaBook= new Book("1", "First Manual Java", "Ion");

       // bookService.addBook(FirstManualJavaBook);

        List<Book> listOfBooks=bookService.books();

        assertTrue(listOfBooks.isEmpty(), "List of books is not empty");

    }

    @Test
    void assertTrueWithMessageSupplier(){
        BookService bookService=new BookService();

        Book FirstManualJavaBook= new Book("1", "First Manual Java", "Ion");

       // bookService.addBook(FirstManualJavaBook);

        List<Book> listOfBooks=bookService.books();

        assertTrue(listOfBooks.isEmpty(), ()-> "List of books is not empty");

    }

    @Test
    void assertTrueWithBooleanSupplierAndNoMessage(){
        BookService bookService=new BookService();

        Book FirstManualJavaBook= new Book("1", "First Manual Java", "Ion");

        //bookService.addBook(FirstManualJavaBook);

        List<Book> listOfBooks=bookService.books();

        assertTrue(()->listOfBooks.isEmpty());

    }

    @Test
    void assertTrueWithBooleanSupplierAndMessage(){
        BookService bookService=new BookService();

        Book FirstManualJavaBook= new Book("1", "First Manual Java", "Ion");

        //bookService.addBook(FirstManualJavaBook);

        List<Book> listOfBooks=bookService.books();

        assertTrue(()->listOfBooks.isEmpty(), "List of books is not empty");

    }

    @Test
    void assertTrueWithBooleanSupplierAndMessageSupplier(){
        BookService bookService=new BookService();

        Book FirstManualJavaBook= new Book("1", "First Manual Java", "Ion");

        //bookService.addBook(FirstManualJavaBook);

        List<Book> listOfBooks=bookService.books();

        assertTrue(()->listOfBooks.isEmpty(), ()->"List of books is not empty");

    }
}
