package com.example.springsecurity.SpringSecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecurity.SpringSecurity.models.Student;

public interface UserRepo extends JpaRepository <Student,Integer>{

}
