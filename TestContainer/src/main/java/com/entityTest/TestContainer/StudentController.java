package com.entityTest.TestContainer;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController("/student")
public class StudentController {
	@Autowired 
	private StudentService service;
	@GetMapping("/studentList")
	public ResponseEntity< List<Student>>list() {
		try {
			List <Student> stu= service.listAll(); 
		        return new ResponseEntity<List<Student>>(stu, HttpStatus.OK);
		    } catch (NoSuchElementException e) {
		        return new ResponseEntity<List<Student>>(HttpStatus.NOT_FOUND);
		    }  
	}
	@PostMapping(value ="/student")
    public void save(@RequestBody Student student) {
        service.save(student);
        
        
	}
}

