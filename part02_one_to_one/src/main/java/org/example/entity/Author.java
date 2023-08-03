package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
    @Id
    private String author_Id;
    private String author_name;

    @OneToOne
    private Book book;

    public Author(String author_Id, String author_name, Book book) {
        this.author_Id = author_Id;
        this.author_name = author_name;
        this.book = book;
    }

    public Author() {
    }

    public String getAuthor_Id() {
        return author_Id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public Book getBook() {
        return book;
    }

    public void setAuthor_Id(String author_Id) {
        this.author_Id = author_Id;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}