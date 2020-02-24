package com.repository;

import com.entities.Jardin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JardinRepository extends CrudRepository<Jardin, Long> {
    Jardin findByJardinId(long jardinId);
}
