package com.rest.bookservice.controllers;

import com.rest.bookservice.entities.Book;
import com.rest.bookservice.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAll() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }
}
