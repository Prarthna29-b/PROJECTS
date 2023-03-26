package com.mapping.OneToMany.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
@Entity
public class Department {
	@Id
	@SequenceGenerator(name="seq",sequenceName="postgresql_seq")        
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
private Integer departmentId;
private String departmentname;
@OneToMany(mappedBy="department",fetch = FetchType.EAGER,  cascade = CascadeType.ALL)
private List<Student> studentlist= new ArrayList<>();

public Integer getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(Integer departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentname() {
	return departmentname;
}
public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}
public List<Student> getStudentlist() {
	return studentlist;
}
public void setStudentlist(List<Student> studentlist) {
	this.studentlist = studentlist;
}

}

