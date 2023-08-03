package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private String book_id;
    private String book_name;
    private String author;
    private String title;
    private String isbn;

    public Book(String book_id, String book_name, String author, String title, String isbn) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public Book() {
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
