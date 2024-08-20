package Hamza.books_rest_api.services;

import java.util.List;
import java.util.Optional;

import Hamza.books_rest_api.domain.Book;

public interface BookService {

    boolean isBookExists(Book book);

    Book save(Book book);

    // <Optional>Book
    Optional<Book> findById(String isbn);

    List<Book> listBooks();

    void  deleteBookById(String id);
}
