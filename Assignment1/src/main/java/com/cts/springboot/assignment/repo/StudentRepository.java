package com.cts.springboot.assignment.repo;

import com.cts.springboot.assignment.model.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public
interface StudentRepository {
    //All Student list initialized
    List<Student> studentList = new ArrayList<>();


    //find All Students
    static List<Student> findAll() {
        return studentList;
    }

    //All Student by id
    static Student findById(int id) {
        return studentList.stream().filter(student -> student.getId() == id).findFirst().get();
    }

    //add new Student
    static Student add(Student student) {
        System.out.println("Students : " + student);
        studentList.add(student);
        return findById(student.getId());
    }

    //Update student score by Student id
    static Student updateScoreById(int id, double score) {
        System.out.println("Id : "+id+" | score = "+score);
        studentList.forEach(student -> {
            if (student.getId() == id) {
                student.setScore(score);
            }
        });
        return findById(id);
    }

    //delete student by id
    static void deleteById(int id) {
        Student student = findById(id);
        studentList.remove(student);
    }

    //Add Multiple Student for demo
    static void AutoADD() {
        studentList.add(new Student(2, "Student-2", 50.52));
        studentList.add(new Student(3, "Student-3", 60.82));
        studentList.add(new Student(4, "Student-4", 70.44));
        studentList.add(new Student(5, "Student-5", 30.21));
        studentList.add(new Student(6, "Student-6", 40.22));
        studentList.add(new Student(7, "Student-7", 70.232));
        studentList.add(new Student(8, "Student-8", 90.20));
        studentList.add(new Student(9, "Student-9", 30.22));
        studentList.add(new Student(10, "Student-10", 20.33));
        studentList.add(new Student(11, "Student-11", 33.0));
        studentList.add(new Student(12, "Student-12", 60.33));
        studentList.add(new Student(13, "Student-13", 7.8));
        studentList.add(new Student(14, "Student-14", 20.27));
        studentList.add(new Student(15, "Student-15", 40.23));
        studentList.add(new Student(16, "Student-16", 50.32));
        studentList.add(new Student(17, "Student-17", 30.34));
        studentList.add(new Student(18, "Student-18", 60.7));
        studentList.add(new Student(19, "Student-19", 80.1));
        studentList.add(new Student(20, "Student-20", 20.5));
        studentList.add(new Student(21, "Student-21", 60.2));
        studentList.add(new Student(22, "Student-22", 30.6));
        studentList.add(new Student(23, "Student-23", 70.2));
        studentList.add(new Student(24, "Student-24", 80.9));
        studentList.add(new Student(25, "Student-25", 90.2));
        studentList.add(new Student(26, "Student-26", 30.4));
        studentList.add(new Student(27, "Student-27", 20.8));
        studentList.add(new Student(28, "Student-28", 10.1));
        studentList.add(new Student(29, "Student-29", 70.2));
        studentList.add(new Student(30, "Student-30", 30.3));
        studentList.add(new Student(31, "Student-31", 20.5));

    }

}
