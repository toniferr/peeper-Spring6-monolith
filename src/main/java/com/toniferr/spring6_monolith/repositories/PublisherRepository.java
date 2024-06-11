package com.toniferr.spring6_monolith.repositories;

import com.toniferr.spring6_monolith.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by toniferr
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
