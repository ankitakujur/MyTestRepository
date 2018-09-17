package com.test;

import mypack1.business.Operation;

public class testOperation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation m=new Operation();
		int a=m.add(3,4);
		System.out.println("Addition :"+a);
		int[] arr={1,5,7,4,5};
		//arr= {1,5,7,4,5};
		int o=m.max(arr);
		System.out.println("Max:"+o);

}
}