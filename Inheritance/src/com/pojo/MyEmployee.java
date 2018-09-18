package com.pojo;

public class MyEmployee {
	private String name;
	private int empid;
	private String Comp_name;
	public MyEmployee() {
		name="ehdswa";
		empid=3789;
		Comp_name="ddszs";
	}
public MyEmployee(String name,int empid )
{
	this();
	this.empid=empid;
	this.name= name;
}
@Override
public String toString() {
	return "MyEmployee [name=" + name + ", empid=" + empid + ", Comp_name=" + Comp_name + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
