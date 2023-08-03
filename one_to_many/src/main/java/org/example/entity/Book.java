package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    private String book_id;
    private String book_name;
    private String title;
    private String isbn;

    @ManyToOne
    private Author author;


    public Book() {
    }

    public Book(String book_id, String book_name, String title, String isbn, Author author) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public String getBook_id() {
        return book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
