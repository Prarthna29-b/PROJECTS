package com.entityTest.TestContainer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentRepo repo;
	public List<Student> listAll()
	{
		return repo.findAll();
		
	}
	public void save(Student student) {
	    repo.save(student);
	}
}
