package com.pojo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demoserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fo=new FileOutputStream("person.txt");
ObjectOutputStream o=new ObjectOutputStream(fo);
o.writeObject(new Person(10, "abcd", "pune", 30));
o.close();
fo.close();
System.out.println("file written successfully");

	}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

catch (IOException e)
{
	e.printStackTrace();
}
}}