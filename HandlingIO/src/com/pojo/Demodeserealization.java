package com.pojo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Demodeserealization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fi= new FileInputStream("person.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			Object o=oi.readObject();
			Person p=(Person)o;
					System.out.println(p.getPerid()+"\t"+p.getPersonName());
		}
catch(FileNotFoundException e)
		{
	e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			
		}
	}

}
