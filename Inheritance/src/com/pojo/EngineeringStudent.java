package com.pojo;

public class EngineeringStudent extends Student {
 public int[] marks;
 private String clg_code;
 private String branch_code;
 public EngineeringStudent() {
	 
 }
 public EngineeringStudent(int[]marks,String clg_code,String branch_code, int ee,String a,int hg)
 {
	 super(ee,a,hg);
	 this.marks=marks;
	 this.clg_code=clg_code;
	 this.branch_code=branch_code;
 }
}
