package com.saswat.springboot.springdatajpa.student.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saswat.springboot.springdatajpa.student.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
