package com.cts.assignment2.Assignment2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Library {

    @Autowired
    private Book book;

      public void displayBookDetails(){
          book.setTitle("Title1");
          book.setAuthor("Author1");
          System.out.println("Library : "+book);
      }
}
