package com.restcrud.repository;
import com.restcrud.entity.InternEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.UUID;

@Repository
public interface InternRepository extends CrudRepository<InternEntity, UUID>{

}
