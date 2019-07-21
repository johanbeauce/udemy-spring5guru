package com.beauce.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.beauce.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
