package com.review.demo.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "detail")
public class DetailModel {
    @Id
    private int eventId;
    private int Amoutexpected;
    private String eventname;
    private Date eventdate;
    private String eventtime;
    
    public DetailModel(int eventId, int amoutexpected, String eventname, Date eventdate, String eventtime) {
        this.eventId = eventId;
        Amoutexpected = amoutexpected;
        this.eventname = eventname;
        this.eventdate = eventdate;
        this.eventtime = eventtime;
    }

    public DetailModel() {
    }

    public int getAmoutexpected() {
        return Amoutexpected;
    }
    public void setAmoutexpected(int amoutexpected) {
        Amoutexpected = amoutexpected;
    }
    public String getEventname() {
        return eventname;
    }
    public void setEventname(String eventname) {
        this.eventname = eventname;
    }
    public Date getEventdate() {
        return eventdate;
    }
    public void setEventdate(Date eventdate) {
        this.eventdate = eventdate;
    }
    public String getEventtime() {
        return eventtime;
    }
    public void setEventtime(String eventtime) {
        this.eventtime = eventtime;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
    
}
