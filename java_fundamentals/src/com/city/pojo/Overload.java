package com.city.pojo;

public  class Overload {
	public float area(float a ) {
		return(a*a);
		
	}
	public float area(float a, float b)
	{
		return(a*b);
		
	}
	public float area( int a)
	{
		return (float) (3.14*a*a);
	}
	public float area(int a,int b)
	{
		return (float) (0.5*b*a);
	}
}


class Overload1
{
public static void main(String args[])
{
	Overload m=new Overload();
	float ar;
	ar= m.area(1.1f);
	System.out.print(ar);
}

}