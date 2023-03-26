package com.hibernate.Mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.Mapping.model.Student;
import com.hibernate.Mapping.service.StudentService;

@RestController
public class StudentController {
	@Autowired 
	private StudentService service;
	
	@PostMapping("/student")
	public void add(@RequestBody Student student) {
	    service.save(student);
	}
}
