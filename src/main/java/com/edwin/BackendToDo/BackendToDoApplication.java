package com.edwin.BackendToDo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("BackendToDoApplication")
public class BackendToDoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendToDoApplication.class, args);
	}

}
