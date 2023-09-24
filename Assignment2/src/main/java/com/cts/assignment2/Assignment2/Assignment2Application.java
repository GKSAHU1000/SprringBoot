package com.cts.assignment2.Assignment2;

import com.cts.assignment2.Assignment2.model.Book;
import com.cts.assignment2.Assignment2.model.Library;
import com.cts.assignment2.Assignment2.model2.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Assignment2Application  implements ApplicationRunner  {
	@Autowired
	Classroom classroom;
	@Autowired
	Library library;
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Assignment2Application.class, args);
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		//Autowire based DI
		System.out.println("Library using autowired based DI");
		library.displayBookDetails();

		System.out.println("Class Room Constructor based DI");
		classroom.displayStudentDetails();
	}
}
