package com.myio;

import java.io.File;
import java.io.IOException;

public class demoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile=new  File("data.txt");
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("file created successfully");

	}

}
