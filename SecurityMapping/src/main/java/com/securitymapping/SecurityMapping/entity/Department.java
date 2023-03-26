package com.securitymapping.SecurityMapping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Department {
	@Id
	@SequenceGenerator(name="seq",sequenceName="postgresql_seq")        
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
private Integer departmentId;
private String name;
@OneToMany(cascade = CascadeType.ALL,mappedBy="department")
private List<Student> studentlist;

public Integer getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(Integer departmentId) {
	this.departmentId = departmentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@JsonManagedReference
public List<Student> getStudentList() {
	return studentlist;
}
public void setStudentList(List<Student> student) {
	this.studentlist = student;
}

}
