package com.jpa.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.jpa.enitity.entity;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(JpaApplication.class, args);
		entity obj1= context.getBean(entity.class);
		obj1.setId(112);
		obj1.setName("chaudhary");
		obj1.setAge(24);
	}

}
