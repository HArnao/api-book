package com.upao.api_book.service;

import com.upao.api_book.model.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);

    List<Book> getAllBooks();
}