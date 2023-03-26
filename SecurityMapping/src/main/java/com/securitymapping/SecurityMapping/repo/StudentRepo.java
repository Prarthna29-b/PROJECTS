package com.securitymapping.SecurityMapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securitymapping.SecurityMapping.entity.Department;
import com.securitymapping.SecurityMapping.entity.Student;

public interface StudentRepo extends JpaRepository <Student ,Integer>  {

	void save(Department department);

	
}
