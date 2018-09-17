package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.beans.Book;
import com.pojo.Person;

public class BookPersistenceImpl implements BookPersistence {

	@Override
	public boolean writeBooks(Book[] books) {
		// TODO Auto-generated method stub
		try
		{
		FileOutputStream fo=new FileOutputStream("books.txt");
		ObjectOutputStream o=new ObjectOutputStream(fo);
		for(int i=0;i<books.length;i++)
		{o.writeObject(books[i]);
		}
		o.close();
		fo.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Book[] readBooks() {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fi= new FileInputStream("books.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			Object o=oi.readObject();
			Book[] p=(Book[])o;
			oi.close();
			fi.close();
			return p;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
