package com.testtask.service.impl;

import com.testtask.model.Book;
import com.testtask.repository.BookRepository;
import com.testtask.repository.impl.BookRepositoryImpl;
import com.testtask.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    public BookServiceImpl(BookRepositoryImpl repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Book save(Book book) {
        return repository.save(book);
    }

    @Override
    public List<Book> findAllGroupByAuthor() {
        return repository.findAllBooksGroupByAuthor();
    }

    @Override
    public List<Book> findAllByCountAndSort(Character c) {
        return repository.findAllByCountAndSort(c);
    }


}
