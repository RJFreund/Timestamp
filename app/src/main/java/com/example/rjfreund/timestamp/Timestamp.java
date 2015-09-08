package com.example.rjfreund.timestamp;

import java.util.Date;

/**
 * Created by rjf5742 on 15-08-22.
 */
public class Timestamp {
    private Date datetime;
    private String text;

    public Timestamp(Date datetime, String text)
    {
        this.datetime = datetime;
        this.text = text;
    }

    public Timestamp(String text)
    {
        this.datetime = new Date();
        this.text = text;
    }

    public Timestamp() {
        this.datetime = new Date();
        this.text = "yo";
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
