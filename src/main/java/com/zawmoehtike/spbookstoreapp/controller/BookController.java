package com.zawmoehtike.spbookstoreapp.controller;

import com.zawmoehtike.spbookstoreapp.domain.Book;
import com.zawmoehtike.spbookstoreapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @CrossOrigin
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book findBookById(@PathVariable("id") int id) {
        return bookRepository.getOne(id);
    }
}
