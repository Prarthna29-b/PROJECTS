package com.securitymapping.SecurityMapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.securitymapping.SecurityMapping.entity.Department;
import com.securitymapping.SecurityMapping.entity.Student;
import com.securitymapping.SecurityMapping.service.StudentService;


@RestController
public class StudentController {
	@Autowired 
	private StudentService service;
	@GetMapping("/student/{id}")
	public Student get(@PathVariable Integer id) {
		Student student = service.get(id);

        return student; 
	}
	@GetMapping("/studentlist")
	public List<Student> list() {
	    return service.listAll();
	}
	@PostMapping(value ="/student")
    public void save(@RequestBody Student student) {
        service.save(student);
        
        
	}
}
