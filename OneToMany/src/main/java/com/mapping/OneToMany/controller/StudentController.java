package com.mapping.OneToMany.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.OneToMany.dto.StudentDto;
import com.mapping.OneToMany.model.Student;
import com.mapping.OneToMany.service.StudentService;

@RestController
public class StudentController {
@Autowired
private ModelMapper modelMapper;
@Autowired
private StudentService service;
@GetMapping("/student/{id}")
public StudentDto get(@PathVariable Integer id) {
StudentDto student=service.get(id);
return student;
}
@PostMapping("/student")
public ResponseEntity<StudentDto>add(@RequestBody Student sddto) {
	
    StudentDto student=service.save(sddto);

	return new ResponseEntity<StudentDto>(student,HttpStatus.CREATED);
}
}
