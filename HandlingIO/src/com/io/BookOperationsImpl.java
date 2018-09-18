package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.beans.Book;

public class BookOperationsImpl implements BookOperations {

	@Override
	public Book[] findAllbooks() {
		// TODO Auto-generated method stub
		BookPersistenceImpl c = new BookPersistenceImpl();
		Book[] d = new Book[2];
		d = c.readBooks();
		return null;
	}

	@Override
	public Book findBookbyISBN(int name) {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the book ISBN no");
//		int s=Integer.parseInt(br.readLine());

		BookPersistenceImpl c = new BookPersistenceImpl();
		Book[] d = new Book[2];
		d = c.readBooks();
		Book result = new Book();
		for (int i = 0; i < d.length; i++) {
			if (d[i].getIsbn() == name) {
				result = d[i];

			}

		}
		return result;
	}

	@Override
	public Book[] findBookbyAuthor(String name) {
		// TODO Auto-generated method stub
		
		BookPersistenceImpl c = new BookPersistenceImpl();
		Book[] d = new Book[2];
		d = c.readBooks();
		Book[] result = new Book[2];
		int flag=0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getAuthor().equals(name)) {
				result[flag++] = d[i];
				break;
			}

		
		}
		return result;

	}
}
