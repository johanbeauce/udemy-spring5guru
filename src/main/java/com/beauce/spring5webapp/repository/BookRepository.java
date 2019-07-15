package com.beauce.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.beauce.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
