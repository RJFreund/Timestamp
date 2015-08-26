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
}
