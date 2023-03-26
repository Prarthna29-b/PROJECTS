package com.securitymapping.SecurityMapping.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.securitymapping.SecurityMapping.entity.Student;
import com.securitymapping.SecurityMapping.repo.StudentRepo;
@Service
@Transactional
	public class StudentService {
		@Autowired
		private StudentRepo studentrepo;
		public Student get(Integer id) {
		    return studentrepo.findById(id).get();
		}
	public void save(Student student) {
	    studentrepo.save(student);
	}
	public List<Student> listAll() {
		return studentrepo.findAll();
	}
	 
}
