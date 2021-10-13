package com.fanxan.task2;

import java.util.Date;

public class Email extends Document{
    private final String subject;
    private final String[]to;

    public Email(String[] authors, Date date,String subject, String[] to) {
        super(authors, date);
        this.subject = subject;
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public String[] getTo() {
        return to;
    }
}
