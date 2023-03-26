package com.example.springsecurity.SpringSecurity.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springsecurity.SpringSecurity.models.Student;
import com.example.springsecurity.SpringSecurity.repo.UserRepo;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepo repo;
public List<Student> listAll()
{
	return repo.findAll();
	
}
public Student get(Integer id) {
    return repo.findById(id).get();
}
 
}
