package org.example.entity;

import java.time.ZonedDateTime;

public class Message {
    private int id;
    private String text;
    private final ZonedDateTime sendTime;

    public Message(String text, ZonedDateTime sendTime) {
        this.text = text;
        this.sendTime = sendTime;
    }

    public Message(String text) {
        this.text = text;
        this.sendTime = ZonedDateTime.now();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ZonedDateTime getSendTime() {
        return sendTime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}
