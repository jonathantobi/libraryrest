package sr.unasat.libraryrest.services;

import sr.unasat.libraryrest.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private static List<Book> bookList;
    private static Long bookId;

    public BookService() {
        bookId = 0L;
        bookList = new ArrayList<>();
        bookList.add(new Book(++bookId, "Harry Potter", "Jk", "HP12345"));
        bookList.add(new Book(++bookId, "Book2", "author2", "B@456"));
        bookList.add(new Book(++bookId, "Book3", "author3", "B#@443"));
    }

    public List<Book> findAll() {
        return bookList;
    }

    public Book add(Book book) {
        book.setId(++bookId);
        bookList.add(book);
        return book;
    }

    public Book update(Book book) {
        for (Book bookToUpdate : bookList) {
            if (bookToUpdate.getId().equals(book.getId())) {
                return book;
            }
        }
        return book;
    }

    public Book delete(Book book) {
        //uitzoeken
        return book;
    }

    public Book findOne(String isbn) {
        for (Book book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
