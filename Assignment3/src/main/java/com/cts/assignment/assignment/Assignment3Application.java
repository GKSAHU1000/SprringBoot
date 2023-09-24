package com.cts.assignment.assignment;

import com.cts.assignment.assignment.cli.CliApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Assignment3Application {
	public static void main(String[] args) {
	 	ConfigurableApplicationContext context = SpringApplication.run(Assignment3Application.class, args);
	      context.getBean(CliApp.class).run();

	}

}
