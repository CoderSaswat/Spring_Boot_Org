package com.saswat.springboot.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.saswat.springboot.thymeleaf.model.Student;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/sendData")
	public ModelAndView sendData() {
		ModelAndView modelAndView = new ModelAndView("data");
		modelAndView.addObject("message", "i am a full stack developer");
		return modelAndView;
	}

	@RequestMapping("/getStudent")
	public ModelAndView getStudent() {
		ModelAndView modelAndView = new ModelAndView("student");
		Student student = new Student();
		student.setId(10);
		student.setName("saswat sk");
		modelAndView.addObject("student", student);
		return modelAndView;
	}

	@RequestMapping("/getStudents")
	public ModelAndView getStudents() {
		ModelAndView modelAndView = new ModelAndView("studentList");
		Student student1 = new Student();
		student1.setId(10);
		student1.setName("saswat sk");

		Student student2 = new Student();
		student2.setId(20);
		student2.setName("kanha nayak");

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);

		modelAndView.addObject("studentList", studentList);
		return modelAndView;
	}

	@RequestMapping("/getStudentForm")
	public ModelAndView getStudentForm() {
		ModelAndView modelAndView = new ModelAndView("studentForm");
		Student student = new Student();
//		student.setId(33);
//		student.setName("lubun nayak");
		modelAndView.addObject("student", student);
		return modelAndView;
	}

	@RequestMapping("/postStudentForm")
	public ModelAndView postStudentForm(@ModelAttribute Student student) {
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("student", student);
		System.out.println(student.getId());
		System.out.println(student.getName());
		return modelAndView;
	}
}
