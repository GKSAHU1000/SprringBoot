package com.cts.springboot.assignment.service;

import com.cts.springboot.assignment.model.Student;
import com.cts.springboot.assignment.repo.StudentRepository;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;

@Service
public class StudentService  implements InitializingBean, DisposableBean {

    @Autowired
    StudentRepository repository;
    Logger logger = Logger.getLogger(StudentService.class.getName()) ;

    //Add Student
      public Student addStudent(Student student) {
          logger.info("created");
       return repository.add(student);

    }

    //add Bulk Students
    public void addMultipleStudents() {
        logger.info("Multiple student added automatically");
         repository.AutoADD();
    }


    //get All Students
    public List<Student> getStudents() {
        logger.info("get all Student");
        return repository.findAll();
    }

    //get Student score By ID
    public Student getStudentById(int id) {
        logger.info("get student by id");
        return repository.findById(id);
    }


    //Update Student score By ID
    public Student updateStudentScore(int id, double score) {
        logger.info("update student by id");
        scoreLog(score);
       return repository.updateScoreById(id, score);
    }


    //Delete Student By iD
    public void deleteStudent(int id) {
        logger.info("delete student by id");
        repository.deleteById(id);
    }

    //Log the Score base desc
    public void scoreLog(double score){
          if(score >= 75){
              logger.info( "Above Average");
          } else if(score >= 50){
              logger.info("Average");
          }else {
              logger.info("Below Average");
          }
      }


    //When Service is Destroyed
    @Override
    public void destroy() throws Exception {
        logger.info("StudentService has been destroyed");
    }

    //StudentService has been initialized
    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("StudentService has been initialized");
    }


}
