package com.cts.assignment2.Assignment2.model2;

import org.springframework.beans.factory.annotation.Autowired;

public class Classroom {

    @Autowired
    private Student student;

    public Classroom(Student student) {
        this.student = student;
    }

    public void displayBookDetails(){
        student.setName("Student1");
        student.setAge(23);
        System.out.println("Classroom : "+student);
    }
}
