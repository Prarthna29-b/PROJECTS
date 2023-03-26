package com.mapping.OneToMany.dto;

import com.mapping.OneToMany.model.Department;

public class StudentDto {
	private Integer studentId;
	private String studentName;
	private DepartmentDto department;
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
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}	
//	public DepartmentDto getDepartmentdto() {
//		return departmentdto;
//	}
//	public void setDepartmentdto(DepartmentDto departmentdto) {
//		this.departmentdto = departmentdto;
//	}
//	
}
