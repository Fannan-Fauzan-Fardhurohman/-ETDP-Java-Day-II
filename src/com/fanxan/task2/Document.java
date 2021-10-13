package com.fanxan.task2;

import java.util.Arrays;
import java.util.Date;

public class Document {
    private String[] authors;
    private final Date date;

    public Document(String[] authors, Date date) {
        this.authors = authors;
        this.date = date;
    }

    public String[] getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }

    public void addAuthors(String name){
        String[] newArray = Arrays.copyOf(this.authors, this.authors.length+1);
        newArray[this.authors.length] = name;
        this.authors = newArray;
    }
}
