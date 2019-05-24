package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@SequenceGenerator(initialValue = 1001, name = "seq")
public class Employee {

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "seq" )
	@Column(name = "empID", nullable = false)
	private Integer empID;
	@Column(name = "empName", length = 64, nullable = false)
	private String empName;
	@Column(name = "organization", length = 64, nullable = false)
	private String organization;
	@Column(name = "role", length = 64, nullable = false)
	private String role;
	@Column(name = "project", length = 64, nullable = false)
	private String project;
	@Column(name = "location", length = 64, nullable = false)
	private String location;

	public Integer getEmpID() {
		return empID;
	}

	public void setEmpID(Integer empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
