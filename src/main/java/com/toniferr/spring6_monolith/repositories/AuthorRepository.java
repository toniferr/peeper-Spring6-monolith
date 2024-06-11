package com.toniferr.spring6_monolith.repositories;

import com.toniferr.spring6_monolith.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by toniferr
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
