package com.mapping.OneToMany.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.OneToMany.dto.DepartmentDto;
import com.mapping.OneToMany.dto.StudentDto;
import com.mapping.OneToMany.model.Department;
import com.mapping.OneToMany.model.Student;
import com.mapping.OneToMany.repo.DepartmentRepo;
import com.mapping.OneToMany.repo.StudentRepo;
	@Service
	@Transactional
		public class StudentService {
		@Autowired
		private DepartmentRepo departmentRepo;
		
		@Autowired
		private ModelMapper modelMapper;
			@Autowired
			private StudentRepo studentrepo;
			
			public StudentDto get(Integer id) {
			    Student student= studentrepo.findById(id).get();
			    StudentDto studentdto=modelMapper.map(student, StudentDto.class);
			    return studentdto;
			}
			 public StudentDto save(Student student) {
				 Department department = departmentRepo.findById(student.getDepartment().getDepartmentId()).get();
				 student.setDepartment(department);
			        student= studentrepo.save(student);
			        StudentDto studentdto=modelMapper.map(student, StudentDto.class);
				    return studentdto;   
			    }
			 
			
}
