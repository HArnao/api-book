package com.upao.api_book.service;

import com.upao.api_book.model.Book;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BookService {
    //Modificamos este metodo
    Book createBook(String title, String author, String description, MultipartFile image);

    List<Book> getAllBooks();
}