package com.cts.assignment2.Assignment2.impl;


import com.cts.assignment2.Assignment2.model.Library;
import com.cts.assignment2.Assignment2.model2.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


public class ApplicationRunnerImpl implements ApplicationRunner {

    @Autowired
    Library library;


    Classroom classroom;

    public ApplicationRunnerImpl(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
         library.displayBookDetails();

          classroom.displayStudentDetails();
    }
}
