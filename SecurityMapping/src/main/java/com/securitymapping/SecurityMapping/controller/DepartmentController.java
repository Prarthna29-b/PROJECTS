package com.securitymapping.SecurityMapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.securitymapping.SecurityMapping.entity.Department;
import com.securitymapping.SecurityMapping.service.DepartmentService;
@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService service;
	@PostMapping(value = "/department")
    public void save(@RequestBody Department department) {
       service.save(department);   
	}
	@GetMapping("/departmentlist")
	public List<Department> list() {
	    return service.listAll();
	}
	@GetMapping("/department/{departmentId}")
	    public Department get(@PathVariable Integer departmentId) {
	        Department dept = service.get(departmentId);
	        return dept;    
	    
	}
}
