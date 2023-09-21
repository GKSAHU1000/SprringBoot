package com.cts.springboot.assignment.controller;

import com.cts.springboot.assignment.model.Student;
import com.cts.springboot.assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student) {
        new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/addauto")
    public ResponseEntity<HttpStatus> addauto() {
        studentService.addAutoStudents();
      return  new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getStudents();
        if (students.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(students, HttpStatus.OK);
        }
    }

    @GetMapping("getbyid/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") int sid) {
        Student student = studentService.getStudentById(sid);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Student> updateStudentScore(@PathVariable("id") int sid, @RequestParam("score") double score) {
        return new ResponseEntity<>(studentService.updateStudentScore(sid, score),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable("id") int sid) {
        studentService.deleteStudent(sid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
