package com.nav.book.service;

import com.nav.book.model.Book;
import com.nav.book.repo.BookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepo bookRepo;

    @Autowired
    public void setBookRepository(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Book save(Book book) {
        return bookRepo.save(book);
    }

    public void delete(Book book) {
        bookRepo.delete(book);
    }

    public Book findOne(String id) {
        return bookRepo.findOne(id);
    }

    public Iterable<Book> findAll() {
        return bookRepo.findAll();
    }

    public Page<Book> findByAuthor(String author, PageRequest pageRequest) {
        return bookRepo.findByAuthor(author, pageRequest);
    }

    public List<Book> findByTitle(String title) {
        return bookRepo.findByTitle(title);
    }

}