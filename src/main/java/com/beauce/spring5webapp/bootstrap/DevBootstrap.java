package com.beauce.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.beauce.spring5webapp.model.Author;
import com.beauce.spring5webapp.model.Book;
import com.beauce.spring5webapp.repository.AuthorRepository;
import com.beauce.spring5webapp.repository.BookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author author = new Author("John", "Doe");
        Book book = new Book("title1", "isbn1", "publisher1");
        author.getBooks().add(book);
        book.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(book);

        Book book1 = new Book("title2", "isbn2", "publisher2");
        Author author1 = new Author("Jane", "Doe");
        book1.getAuthors().add(author1);

        authorRepository.save(author1);
        bookRepository.save(book1);

    }
}
