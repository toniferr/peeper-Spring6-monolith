package com.toniferr.spring6_monolith.services;

import com.toniferr.spring6_monolith.domain.Book;
import com.toniferr.spring6_monolith.repositories.BookRepository;
import org.springframework.stereotype.Service;

/**
 * Created by toniferr
 */
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
