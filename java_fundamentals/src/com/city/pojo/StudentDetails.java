package com.city.pojo;

public class StudentDetails {
private int rollno;
private String name;
private static String Institute;
static
{
	Institute="IIT";
}
public StudentDetails(int rollno,String name)
{
	this.rollno=rollno;
	this.name=name;
}
public void display() 
{
	System.out.println("Name:\t"+name+"\t rollno:"+rollno+"\t Institute:"+Institute);
}

public static void main(String args[]) {
	StudentDetails m;
	m=new StudentDetails(10, "Ankita");
	m.display();
}}
