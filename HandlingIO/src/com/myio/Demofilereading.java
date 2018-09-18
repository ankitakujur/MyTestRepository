package com.myio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demofilereading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader reader=new FileReader("data.txt");
			byte b;
			do
			{
			int data=reader.read();
			System.out.print((char)data);
			b=(byte)data;
			}while(b!=0);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
