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

import com.mapping.OneToMany.dto.DepartmentDto;
import com.mapping.OneToMany.model.Department;
import com.mapping.OneToMany.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService service;
	@GetMapping("/department/{id}")
	public ResponseEntity<DepartmentDto> get(@PathVariable Integer id) {
	DepartmentDto department=service.get(id);
	return new ResponseEntity<DepartmentDto>(department, HttpStatus.OK);
	}
	@PostMapping("/department")
	public ResponseEntity<DepartmentDto> add(@RequestBody Department sddto) {
		DepartmentDto department =service.save(sddto);
		return new ResponseEntity<DepartmentDto>(department,HttpStatus.CREATED);
	}
}
