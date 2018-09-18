package com.myio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class demoRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your name");
		try {
		String name=br.readLine();
		System.out.println("you entered:"+name);
	}catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		}
}

		