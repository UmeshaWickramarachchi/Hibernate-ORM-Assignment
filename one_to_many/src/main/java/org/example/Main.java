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
        book.setBook_id("B003");
        book.setBook_name("Brave New World");
        book.setTitle("Novel");
        book.setIsbn("ISBN 978-3-16-13456-0");

        Book book2=new Book();
        book2.setBook_id("B004");
        book2.setBook_name("Island");
        book2.setTitle("Novel");
        book2.setIsbn("ISBN 978-3-16-13456-0");

        Author author=new Author();
        author.setAuthor_Id("A002");
        author.setAuthor_name("Aldous Huxley");

        List<Book> bookList=new ArrayList<>();
        bookList.add(book);
        bookList.add(book2);

        author.setBooks(bookList);

        book.setAuthor(author);
        book2.setAuthor(author);


        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.persist(book);
        session.persist(book2);
        session.persist(author);



        transaction.commit();
        session.close();


    }
}
