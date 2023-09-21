package com.cts.springboot.assignment.controller;

import com.cts.springboot.assignment.model.Student;
import com.cts.springboot.assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student) {
        new ResponseEntity<>(service.addStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/addauto")
    public ResponseEntity<HttpStatus> addauto() {
        service.addMultipleStudents();
      return  new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = service.getStudents();
        if (students.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(students, HttpStatus.OK);
        }
    }

    @GetMapping("getbyid/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") int sid) {
        Student student = service.getStudentById(sid);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Student> updateStudentScore(@PathVariable("id") int sid, @RequestParam("score") double score) {
        return new ResponseEntity<>(service.updateStudentScore(sid, score),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable("id") int sid) {
        service.deleteStudent(sid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
