package com.mapping.OneToMany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.OneToMany.model.Department;

	public interface DepartmentRepo extends JpaRepository<Department,Integer> {
		
		}

