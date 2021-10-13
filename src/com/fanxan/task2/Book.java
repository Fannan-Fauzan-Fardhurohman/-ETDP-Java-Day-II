package com.fanxan.task2;

import java.util.Date;

public class Book extends Document{
    private final String title;

    public Book(String[] authors, Date date,String title) {
        super(authors, date);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
