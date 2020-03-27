package com.angularcrud;

import com.angularcrud.model.User;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Type;

@SpringBootApplication
public class AngularCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularCrudApplication.class, args);
	}

}
