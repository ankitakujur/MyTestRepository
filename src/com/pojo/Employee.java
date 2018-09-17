package com.pojo;

import java.sql.Date;

public class Employee {
	private int empID;
	private String empName;
	private double Salary;
	private int age;
	private Date joiningDate;

	public Employee() {
		empID = 0;
		empName = "NULL";
		Salary = 00.0;
		age = 0;
		joiningDate = new Date(0);
	}

	public Employee(int empID, String empName, double salary, int age, Date joiningDate) {
		super();
		this.empID = empID;
		this.empName = empName;
		Salary = salary;
		this.age = age;
		this.joiningDate = joiningDate;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
}
