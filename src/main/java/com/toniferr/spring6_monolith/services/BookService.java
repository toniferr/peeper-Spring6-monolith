package com.toniferr.spring6_monolith.services;

import com.toniferr.spring6_monolith.domain.Book;

/**
 * Created by toniferr
 */
public interface BookService {

    Iterable<Book> findAll();

}
