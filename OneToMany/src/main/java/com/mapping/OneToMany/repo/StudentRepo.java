package com.mapping.OneToMany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.OneToMany.model.Student;

public interface StudentRepo extends JpaRepository <Student ,Integer>  {

}