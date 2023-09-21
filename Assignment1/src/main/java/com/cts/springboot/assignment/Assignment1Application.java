package com.cts.springboot.assignment;

import com.cts.springboot.assignment.controller.StudentController;
import com.cts.springboot.assignment.model.Student;
import com.cts.springboot.assignment.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Assignment1Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Assignment1Application.class, args);

		//get Student Service class from bean
		StudentService service = context.getBean(StudentService.class);

		System.out.println("Add New Student");
		//Add new students
		service.addStudent(new Student(1, "Student-1",20.00));

		System.out.println();
		System.out.println();

		System.out.println("Add multiple Students automatically");
		//Add multiple Students automatically
		service.addMultipleStudents();

		System.out.println();
		System.out.println();

		System.out.println("Fetch and display the students.");
		// Fetch and display the students.
		service.getStudents().forEach(System.out::println);

		System.out.println();
		System.out.println();

		System.out.println("Update scores and observe the scoring system logs.  with Above Average");
		///Update scores and observe the scoring system logs.
		service.updateStudentScore(1, 90.00);

		System.out.println();
		System.out.println();

		System.out.println("Update scores and observe the scoring system logs  with Average");
		///Update scores and observe the scoring system logs.
		service.updateStudentScore(2, 60.00);

		System.out.println();
		System.out.println();

		System.out.println("Update scores and observe the scoring system logs with Below Average");
		///Update scores and observe the scoring system logs.
		service.updateStudentScore(3, 30.00);


		System.out.println();
		System.out.println();

		System.out.println("Remove a student");
		//• Remove a student
		service.deleteStudent(5);

	}

}
