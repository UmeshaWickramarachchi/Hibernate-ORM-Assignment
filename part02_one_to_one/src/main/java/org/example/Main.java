package org.example;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Book book=new Book();
        book.setBook_id("B002");
        book.setBook_name("Robinson Crusoe");
        book.setTitle("Novel");
        book.setIsbn("ISBN 978-3-16-3457-0");

        Author author=new Author();
        author.setAuthor_Id("A001");
        author.setAuthor_name("Daniel Defoe");
        author.setBook(book);


        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.persist(book);
        session.persist(author);

        transaction.commit();
        session.close();

    }
}