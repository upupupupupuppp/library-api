package com.example.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final List<Book> books = List.of(
            new Book(1L, "Преступление и наказание", "Фёдор Достоевский"),
            new Book(2L, "Мастер и Маргарита", "Михаил Булгаков"),
            new Book(3L, "Война и мир", "Лев Толстой")
    );

    @GetMapping("/books")
    public List<Book> getBooks() {
        return books;
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Long id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/health")
    public String health() {
        return "Library API is running";
    }
}