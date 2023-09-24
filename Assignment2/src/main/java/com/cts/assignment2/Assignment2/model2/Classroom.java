package com.cts.assignment2.Assignment2.model2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Classroom {



    private Student student;


    @Autowired
    public Classroom(Student student) {
        this.student = student;
    }

    public void displayStudentDetails(){
        student.setName("Student1");
        student.setAge(23);
        System.out.println("Classroom : "+student);
    }
}
