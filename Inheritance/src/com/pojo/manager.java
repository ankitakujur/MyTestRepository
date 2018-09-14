package com.pojo;

public class manager extends Employee {
	private double incentive;
	private String department;
	public manager()
	{System.out.println("manager invoked");
		incentive=12d;
		department="admin";
		
	}
public manager (double incentive, String department, int empid,String empname,String com_name) {
	super(empid,empname,com_name);
	this.incentive=incentive;
	this.department=department;
	
}
public String toString()
{
super.display();
	return("Incentive:"+incentive+"\tDepartment:"+department);
	
}
}
