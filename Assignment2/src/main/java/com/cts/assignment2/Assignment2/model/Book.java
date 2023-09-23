package com.cts.assignment2.Assignment2.model;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Book {
    private String title;
    private String author;
    public Book( String title, String author) {
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
