package com.abhi.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean(name="teacher")
	public Teacher addTeacher() {
		return new Teacher();
	}
	@Bean(name="student")
	public Student getStudent() {
		return new Student();
	}
}
