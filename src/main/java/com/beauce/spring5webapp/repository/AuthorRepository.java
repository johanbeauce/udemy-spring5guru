package com.beauce.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.beauce.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
