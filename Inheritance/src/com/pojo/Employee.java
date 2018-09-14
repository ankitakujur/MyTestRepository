package com.pojo;

 abstract public class Employee {
private int empid;
private String empname;
private String com_name;
public Employee()
{
	System.out.println("Employee invoked");
	empid=10;
	empname="citi";
	com_name="CITI";
	
}
public Employee(int empid,String empname,String com_name ) {
	this.empid=empid;
	this.empname=empname;
	this.com_name=com_name;
}
public void  display()
{
	System.out.println("name:"+empname+"\tid:"+empid+"\t company:"+com_name);
	
}
}

