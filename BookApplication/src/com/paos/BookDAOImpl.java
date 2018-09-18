package com.paos;
import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.connection.Book;
import com.connection.myconnection;
import com.paos.BookDAO;
import com.connection.myconnection;

import java.util.List;

import com.connection.Book;

public class BookDAOImpl implements BookDAO {

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		int rowsAdded = 0;
		String ADDBOOK = "Insert into book values(?,?,?,?,?)";

		try {
			Connection con = myconnection.openConnection();

			PreparedStatement ps = con.prepareStatement(ADDBOOK);
			ps.setInt(1, book.getISBN());
			ps.setString(2, book.getBookName());
			ps.setString(3, book.getPublication());
			ps.setString(4, book.getAuthor());
			ps.setDouble(5, book.getPrice());
			rowsAdded = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return rowsAdded;
	}

	@Override
	public boolean updateBook(int ISBN, Book Book) {
		// TODO Auto-generated method stub
		boolean isUpdated = false;
		String UPDATE_BOOK = "update book set price=? where ISBN=?";
		try (Connection con = myconnection.openConnection();) {
			PreparedStatement ps = con.prepareStatement(UPDATE_BOOK);
			ps.setDouble(1, Book.getPrice());
			ps.setInt(2, ISBN);
			int rows = ps.executeUpdate();
			if (rows > 0) {
				isUpdated = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return isUpdated;
	}

	@Override
	public Book findBookByISBN(int ISBN) {
		// TODO Auto-generated method stub
		return null;
	}
@Override
	public List<Book> findAllBooks(float price)
{
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		String FIND_ALL = "SELECT * FROM BOOK ";
		try (Connection con = myconnection.openConnection();) {
			PreparedStatement ps = con.prepareStatement(FIND_ALL);
		
			//ps.setFloat(1, price);
	 	   ResultSet set = ps.executeQuery();
			while (set.next()) {
				int ISBN = set.getInt(1);
				String bookname = set.getString("bookname");
				String author = set.getString("author");
				String publication = set.getString("publication");
				float price1 = set.getFloat("price");
				Book Book = new Book( bookname,ISBN, price1, publication, author);
				books.add(Book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;

	}

	@Override
	public int deleteBook(int ISBN) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		String FIND_BY_PRICE = "SELECT * FROM BOOK";
		try (Connection con = myconnection.openConnection();) {
			PreparedStatement ps = con.prepareStatement(FIND_BY_PRICE);
		
			//ps.setFloat(1, price);
	 	   ResultSet set = ps.executeQuery();
			while (set.next()) {
				int ISBN = set.getInt(1);
				String bookname = set.getString("bookname");
				String author = set.getString("author");
				String publication = set.getString("publication");
				float price1 = set.getFloat("price");
				Book Book = new Book( bookname,ISBN, price1, publication, author);
				books.add(Book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
		
	
	}

	

}
