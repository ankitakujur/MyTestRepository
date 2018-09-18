package com.city.pojo;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[10];
int sum,avg;
sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter 10 nos");
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
	sum=sum+arr[i];
}
avg=sum/10;
System.out.println("nos less than avg");

for(int i=0;i<arr.length;i++)
{
	if(arr[i]<avg)
	{
		System.out.println(arr[i]);
	}	
}

	}

}
