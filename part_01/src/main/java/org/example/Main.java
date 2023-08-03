package org.example;

import org.example.entity.Book;
import org.example.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Book book=new Book();
        book.setBook_id("B001");
        book.setBook_name("Robinson Crusoe");
        book.setAuthor("Daniel Defoe");
        book.setTitle("Novel");
        book.setIsbn("ISBN 978-3-16-13456-0");



        //create book
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        session.persist(book);


        //retrieve book details

        book=session.get(Book.class,"B001");
        System.out.println("Book Id :"+book.getBook_id());
        System.out.println("Book Name :"+book.getBook_name());
        System.out.println("Book Author :"+book.getAuthor());
        System.out.println("Book Tittle :"+book.getTitle());
        System.out.println("Book ISBN :"+book.getIsbn());



        //update book details
        book.setBook_name("The Hunter");
        book.setAuthor("Jennifer Herrera");
        book.setTitle("Horror");
        book.setIsbn("ISBN 978-3-16-13456-0");
        session.persist(book);

        //delete book
        session.remove(book);

        transaction.commit();
        session.close();


    }
}
