package com.kdacademy.graphql.graphqlproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdacademy.graphql.graphqlproject.entities.Book;
import com.kdacademy.graphql.graphqlproject.repositories.BookRepo;

@Service
public class BookServiceImpl implements BookService{

    private BookRepo bookRepo ;
    
    @Autowired
    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book create(Book book) {
       return this.bookRepo.save(book) ;
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll() ;
    }

    @Override
    public Book get(int bookId) {
        return this.bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("The requested book is unavailable on the server.")) ;
        // return this.bookRepo.findById(bookId).orElse(new Book()) ;
    }
    
}
