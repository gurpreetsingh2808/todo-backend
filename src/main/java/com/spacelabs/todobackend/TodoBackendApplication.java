package com.spacelabs.todobackend;

import com.spacelabs.todobackend.dto.Task;
import com.spacelabs.todobackend.dto.Todo;
import com.spacelabs.todobackend.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootApplication
public class TodoBackendApplication {


	public static void main(String[] args) {
		SpringApplication.run(TodoBackendApplication.class, args);
		File f = new File("firebaseAccountKey.json");
		System.out.println(f.getAbsolutePath());
	}

}
