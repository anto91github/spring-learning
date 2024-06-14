package com.anto.SpringJDBCDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.anto.SpringJDBCDemo.model.Alien;
import com.anto.SpringJDBCDemo.repo.AlienRepo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);
		
		Alien alien1 = context.getBean(Alien.class);		
		alien1.setId(111);
		alien1.setName("Navin");
		alien1.setTech("Java");
		
		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);
		
		System.out.println(repo.findAll());
		
	}
}
