package com.toniferr.spring6_monolith.repositories;

import com.toniferr.spring6_monolith.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by toniferr
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
