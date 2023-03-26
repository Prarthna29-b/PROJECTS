package com.mapping.OneToMany.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Student {
	@Id
	@SequenceGenerator(name="seq",sequenceName="postgresql_seq")        
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
private Integer studentId;
private String studentName;
@ManyToOne(cascade = CascadeType.ALL)
private Department department;
public Integer getStudentId() {
	return studentId;
}
public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}

}
