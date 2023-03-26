package com.mapping.OneToMany.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.OneToMany.dto.DepartmentDto;
import com.mapping.OneToMany.model.Department;
import com.mapping.OneToMany.repo.DepartmentRepo;
@Service
@Transactional
public class DepartmentService {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private DepartmentRepo departmentrepo;
	
	public DepartmentDto get(Integer id) {
	    Department department=departmentrepo.findById(id).get();
	    DepartmentDto departmentdto=modelMapper.map(department, DepartmentDto.class);
	    return departmentdto;
	}
	 public DepartmentDto save(Department department) {
		  department=departmentrepo.save(department);
	       DepartmentDto departmentresponse=modelMapper.map(department, DepartmentDto.class);
return departmentresponse;
	 
	 }
}
