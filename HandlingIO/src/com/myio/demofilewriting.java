package com.myio;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

public class demofilewriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter	writer=null;

try {
writer = new FileWriter("data.txt");
	writer.write("hello from java");
System.out.println("file written successfully");

} catch (IOException e) {
	// TODO Auto-generated catch block
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
