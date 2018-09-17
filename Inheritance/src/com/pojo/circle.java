package com.pojo;

public class circle extends Shape {
	private int radius;
	public circle()
	{
		
	}
public circle(int radius) {
	this.radius=radius;
}
public double area()
{
	return(3.14*radius*radius);
}
}
