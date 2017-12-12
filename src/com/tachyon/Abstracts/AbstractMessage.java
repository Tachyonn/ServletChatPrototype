package com.tachyon.Abstracts;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractMessage {
    private String from; // May be type User here needed
    private String to; // May be type User here needed
    private Date sent;
    private String text;

    public AbstractMessage() { //default constructor, object not null
        this.sent = new Date();
        this.from = "default";
        this.to = "default";
        this.text = "default constructor";
    }

    public AbstractMessage(String from, String to, String text) {
        this.from = from;
        this.to = to;
        this.text = text;
        this.sent = new Date();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getSent() {
        return sent;
    }

    public void setSent(Date sent) {
        this.sent = sent;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yy-HH:mm");
        sb.append(sdf.format(sent))
                .append(" From ")
                .append(from)
                .append(" to ")
                .append(to)
                .append(" ")
                .append(text);
        return sb.toString();
    }
}
