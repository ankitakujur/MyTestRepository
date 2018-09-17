package com.myio;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		
		FileWriter	writer=null;

	try {
		System.out.println("enter the no of hobbies you want to enter");

		int i=Integer.parseInt(a.readLine());
		System.out.println("Enter name  address");

		String name=a.readLine();
		String address=a.readLine();
		String[]  hobby= new String[i];
		 System.out.println("enter your hobbies");
		 for(int b=0;b<i;b++)
		 {
			 hobby[b]=a.readLine();
		 }
		System.out.println("Name:"+name);
		System.out.println("Address"+address);
		for(int c=0;c<i;c++)
			System.out.println("Hobbies:"+hobby[c]);
		writer = new FileWriter("data.txt",true);
		writer.write(name);
		writer.write(address);
		 for(int b=0;b<i;b++)
		 {
			 writer.write(hobby[b]);
		 }
	System.out.println("file written successfully");
		
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		finally
		{
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}


}
}