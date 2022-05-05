package com.saswat.springboot.springdatajpa;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.saswat.springboot.springdatajpa.student.entities.Student;
import com.saswat.springboot.springdatajpa.student.repos.StudentRepository;


@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	private StudentRepository repository;
	@Test	
	void testSaveStudent() {
		Student student = new Student();
		student.setId(1L);
		student.setName("saswat");
		student.setTestScore(515);
		repository.save(student);
		
		Optional<Student> optional = repository.findById(1L);
			if(optional.isPresent()) {
				Student student2 = optional.get();
				System.out.println(student2.getName());
			}
		}
	}


