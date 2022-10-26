package test;

import bookstore.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertFalseDemo {

    @Test
    void assertFalseWithNoMessage(){
        BookService bookService=new BookService();

        Book FirstManualJavaBook= new Book("1", "First Manual Java", "Ion");

        bookService.addBook(FirstManualJavaBook);

        List<Book> listOfBooks=bookService.books();

        assertFalse(listOfBooks.isEmpty());

    }

    @Test
    void assertFalseWithMessage(){
        BookService bookService=new BookService();

        Book FirstManualJavaBook= new Book("1", "First Manual Java", "Ion");

        bookService.addBook(FirstManualJavaBook);

        List<Book> listOfBooks=bookService.books();

        assertFalse(listOfBooks.isEmpty(), "List of books is empty");

    }

    @Test
    void assertFalseWithMessageSupplier(){
        BookService bookService=new BookService();

        Book FirstManualJavaBook= new Book("1", "First Manual Java", "Ion");

        bookService.addBook(FirstManualJavaBook);

        List<Book> listOfBooks=bookService.books();

        assertFalse(listOfBooks.isEmpty(), ()-> "List of books is empty");

    }

    @Test
    void assertFalseWithBooleanSupplierAndNoMessage(){
        BookService bookService=new BookService();

        Book FirstManualJavaBook= new Book("1", "First Manual Java", "Ion");

        bookService.addBook(FirstManualJavaBook);

        List<Book> listOfBooks=bookService.books();

        assertFalse(()->listOfBooks.isEmpty());

    }

    @Test
    void assertFalseWithBooleanSupplierAndMessage(){
        BookService bookService=new BookService();

        Book FirstManualJavaBook= new Book("1", "First Manual Java", "Ion");

        bookService.addBook(FirstManualJavaBook);

        List<Book> listOfBooks=bookService.books();

        assertFalse(()->listOfBooks.isEmpty(), "List of books is empty");

    }

    @Test
    void assertFalseWithBooleanSupplierAndMessageSupplier(){
        BookService bookService=new BookService();

        Book FirstManualJavaBook= new Book("1", "First Manual Java", "Ion");

        bookService.addBook(FirstManualJavaBook);

        List<Book> listOfBooks=bookService.books();

        assertFalse(()->listOfBooks.isEmpty(), ()->"List of books is not empty");

    }
}
