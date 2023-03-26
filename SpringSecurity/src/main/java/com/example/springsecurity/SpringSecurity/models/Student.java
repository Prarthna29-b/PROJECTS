package com.example.springsecurity.SpringSecurity.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Student  {
	
Integer id;	
String username;
String password;
String email;


public Student() {
	
}

@Id
@SequenceGenerator(name="seq",sequenceName="postgresql_seq")        
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}

