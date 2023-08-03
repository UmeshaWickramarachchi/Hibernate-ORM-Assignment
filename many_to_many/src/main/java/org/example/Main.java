package org.example;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book=new Book();
        book.setBook_id("B005");
        book.setBook_name("Brave New World");
        book.setTitle("Novel");
        book.setIsbn("ISBN 978-3-16-13456-0");

        Book book1=new Book();
        book1.setBook_id("B006");
        book1.setBook_name("Island");
        book1.setTitle("Novel");
        book1.setIsbn("ISBN 978-3-16-13456-0");

        Author author=new Author();
        author.setAuthor_Id("A001");
        author.setAuthor_name("Aldous Huxley");

        Author author1=new Author();
        author1.setAuthor_Id("A002");
        author1.setAuthor_name("Daniel Defoe");

        List<Book> bookList=new ArrayList<>();
        bookList.add(book);
        bookList.add(book1);

        List<Author> authorList=new ArrayList<>();
        authorList.add(author);
        authorList.add(author1);

        book.setAuthors(authorList);
        book1.setAuthors(authorList);

        author.setBooks(bookList);
        author1.setBooks(bookList);


        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.persist(book);
        session.persist(book1);

        session.persist(author);
        session.persist(author1);

        transaction.commit();
        session.close();

    }
}
