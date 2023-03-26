package com.example.springsecurity.SpringSecurity.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.SpringSecurity.models.Student;
import com.example.springsecurity.SpringSecurity.service.UserService;
@RestController
public class UserController {
@Autowired 
private UserService service;
@GetMapping("/student")
public List<Student> list() {
    return service.listAll();
}
@GetMapping("/student/{id}")
public ResponseEntity<Student> get(@PathVariable Integer id)
{
	try {
	Student user= service.get(id); 
        return new ResponseEntity<Student>(user, HttpStatus.OK);
    } catch (NoSuchElementException e) {
        return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
    }  
}
}
