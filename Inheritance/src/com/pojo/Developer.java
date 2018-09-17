package com.pojo;

public class Developer extends Employee {
	
	String[] project_names;
	public Developer()
	{
	project_names=new String[2];
	project_names[0]="ABC";
	project_names[1]="CDE";
	}
public Developer(String[] project_names)
{
	this.project_names= project_names;
	
}
public  void display()
{
	for(int i=0;i<project_names.length;i++)
	System.out.println(project_names[i]);
	
}
}
