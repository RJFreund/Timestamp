package com.example.rjfreund.timestamp;

import java.util.Date;

/**
 * Created by rjf5742 on 15-08-22.
 */
public class Timestamp {
    private Date createDate;
    private String note;

    public Timestamp(Date createDate, String note)
    {
        this.createDate = createDate;
        this.note = note;
    }

    public Timestamp(String note)
    {
        this.createDate = new Date();
        this.note = note;
    }

    public Timestamp() {
        this.createDate = new Date();
        this.note = "yo";
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
