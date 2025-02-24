package com.rest.bookservice.services;

import com.rest.bookservice.entities.Book;
import com.rest.bookservice.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * Retrieves all books from the database.
     *
     * @return a list of books.
     */
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
