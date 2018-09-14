package com.myinterfaces;

import com.pojo.Student;
import com.pojo.EngineeringStudent;

public class calculations_impl implements Mycalculation {

	@Override
	public int addition(Student s) {
		// TODO Auto-generated method stub
		EngineeringStudent m= (EngineeringStudent)s;
		System.out.println(m);
		System.out.println(((EngineeringStudent)s).marks[0]);
		return 64;
	}

	@Override
	public double percentage(int add) {
		// TODO Auto-generated method stub
		
		return (add/5);
	}

	@Override
	public String showGrade(double percentage) {
		// TODO Auto-generated method stub
		return "G";
	}

}
