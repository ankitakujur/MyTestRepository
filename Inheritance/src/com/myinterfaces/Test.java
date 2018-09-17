package com.myinterfaces;

import com.pojo.EngineeringStudent;
import com.pojo.Student;
import com.myinterfaces.*;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Student[] s=new EngineeringStudent[2];
		int []arr= {1,2,3,4};
		for (int i=0;i<2;i++)
		{
		Scanner sc= new Scanner(System.in);
		
		String b=sc.next();
		String c =sc.next();
		s[i]= new EngineeringStudent(arr,b,c,1,"sejg",67);
		}
		Mycalculation e= new calculations_impl();
		e.addition(s[0]);
		double d=e.percentage(20);
		String var=e.showGrade(d);
		System.out.println(var);
		

	}

}
