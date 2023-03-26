package com.securitymapping.SecurityMapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securitymapping.SecurityMapping.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
