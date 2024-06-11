package com.toniferr.spring6_monolith.services;

import com.toniferr.spring6_monolith.repositories.AuthorRepository;
import com.toniferr.spring6_monolith.domain.Author;
import org.springframework.stereotype.Service;

/**
 * Created by toniferr
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
