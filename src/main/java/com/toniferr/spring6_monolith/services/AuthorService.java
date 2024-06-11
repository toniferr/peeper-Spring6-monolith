package com.toniferr.spring6_monolith.services;

import com.toniferr.spring6_monolith.domain.Author;

/**
 * Created by toniferr
 */
public interface AuthorService {

    Iterable<Author> findAll();
}
