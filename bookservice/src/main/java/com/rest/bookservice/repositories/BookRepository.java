package com.rest.bookservice.repositories;

import com.rest.bookservice.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    // You can define custom query methods here if needed
}
