package com.securitymapping.SecurityMapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
public class Student {
@Id
@SequenceGenerator(name="seq",sequenceName="postgresql_seq")        
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
private Integer id;
private String name;
@ManyToOne
@JoinColumn(name = "dept_id")
private Department department;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@JsonBackReference
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}

}
