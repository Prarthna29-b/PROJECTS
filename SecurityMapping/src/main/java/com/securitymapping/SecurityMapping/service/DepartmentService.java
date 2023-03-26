package com.securitymapping.SecurityMapping.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securitymapping.SecurityMapping.entity.Department;
import com.securitymapping.SecurityMapping.repo.DepartmentRepo;
@Service
@Transactional
public class DepartmentService {
@Autowired 
private DepartmentRepo   departmentrepo;

public void save(Department department) {
    departmentrepo.save(department);
}
public Department get(Integer id) {
    return departmentrepo.findById(id).get();
}
public List<Department> listAll() {
	return departmentrepo.findAll() ;
}
}
