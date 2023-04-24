package com.upao.api_book.controller;

import com.upao.api_book.model.Book;
import com.upao.api_book.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBook(){
        return new ResponseEntity<List<Book>>(bookService.getAllBooks(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        return new ResponseEntity<Book>(bookService.createBook(book),HttpStatus.CREATED);
    }
}
