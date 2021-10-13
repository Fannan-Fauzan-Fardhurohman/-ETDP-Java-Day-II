package com.fanxan.task2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Document
        Document document = new Document(new String[]{"author-1", "author-2"}, new Date());
        document.addAuthors("author-3");

        StringBuilder authors = new StringBuilder();
        for (String x : document.getAuthors()) {
            authors.append(x).append(" ");
        }
        System.out.println("authors : " + authors + "\ndate : " + document.getDate() + "\n");


//        Book
        Book book = new Book(new String[]{"author-1", "author-2"}, new Date(), "SEPERTI HUJAN");
        authors = new StringBuilder();

        for (String x : book.getAuthors()) {
            authors.append(x).append(" ");
        }
        System.out.println("authors : " + authors + "\ndate : " + book.getDate() + "\ntitle : "
                + book.getTitle() + "\n");


        // Email
        Email email = new Email(new String[] { "author-1", "author-2" }, new Date(), "email penting",
                new String[] { "reciver-1", "reciver-2" });
        authors = new StringBuilder();
        for (String x : email.getAuthors()) {
            authors.append(x).append(" ");
        }
        StringBuilder to = new StringBuilder();
        for (String x : email.getTo()) {
            to.append(x).append(" ");
        }
        System.out.println("authors : " + authors + "\ndate : " + email.getDate() + "\nsubject : "
                + email.getSubject() + "\nto : " + to + "\n");
    }
}
