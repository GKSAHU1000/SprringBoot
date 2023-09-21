package com.cts.springboot.assignment.service;

import com.cts.springboot.assignment.model.Student;
import com.cts.springboot.assignment.repo.StudentRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;

@Service
public class StudentService  implements InitializingBean, DisposableBean {

    Logger logger = Logger.getLogger(StudentService.class.getName()) ;

      public Student addStudent(Student student) {
          logger.info("created");
       return StudentRepository.add(student);

    }

    public void addAutoStudents() {
        logger.info("Multiple student added automatically");
         StudentRepository.AutoADD();
    }


    public List<Student> getStudents() {
        logger.info("get all Student");
        return StudentRepository.findAll();
    }

    public Student getStudentById(int id) {
        logger.info("get student by id");
        return StudentRepository.findById(id);
    }


    public Student updateStudentScore(int id, double score) {
        logger.info("update student by id");
        scoreLog(score);
       return StudentRepository.updateScoreById(id, score);
    }


    public void deleteStudent(int id) {
        logger.info("delete student by id");
        StudentRepository.deleteById(id);
    }

    public void scoreLog(double score){
          if(score >= 75){
              logger.info( "Above Average");
          } else if(score >= 50){
              logger.info("Average");
          }else {
              logger.info("Below Average");
          }
      }


    @Override
    public void destroy() throws Exception {
        logger.info("StudentService has been destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("StudentService has been initialized");
    }


}
