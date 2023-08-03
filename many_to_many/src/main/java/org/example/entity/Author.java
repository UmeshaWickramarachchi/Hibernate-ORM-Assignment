package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Author {
    @Id
    private String author_Id;
    private String author_name;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books;


    public Author(String author_Id, String author_name, List<Book> books) {
        this.author_Id = author_Id;
        this.author_name = author_name;
        this.books = books;
    }

    public Author() {
    }

    public String getAuthor_Id() {
        return author_Id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setAuthor_Id(String author_Id) {
        this.author_Id = author_Id;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
