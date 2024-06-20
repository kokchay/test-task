package com.testtask.repository;

import com.testtask.model.Book;

import java.util.List;

public interface BookRepository {

    List<Book> findAll();

    Book save(Book t);

    List<Book> findAllBooksGroupByAuthor();

    List<Book> findAllByCountAndSort(Character c);

}
