package com.mapping.OneToMany.dto;

import java.util.ArrayList;
import java.util.List;

import com.mapping.OneToMany.model.Student;

public class DepartmentDto {
	private Integer departmentId;
	private String departmentname;
	private List<StudentDto> studentlist= new ArrayList<>();
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
	public List<StudentDto> getStudentlist() {
		return studentlist;
	}
	public void setStudentlist(List<StudentDto> studentlist) {
		this.studentlist = studentlist;
	}
	
	
}
