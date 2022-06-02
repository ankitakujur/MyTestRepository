package com.paos;
import java.util.List;


	import com.connection.Book;

	public interface BookDAO {
		int addBook(Book book);

		boolean updateBook(int ISBN, Book Book);

		Book findBookByISBN(int ISBN);

	

		int deleteBook(int ISBN);
List<Book> findAllBooks(float price);
List<Book> findAllBooks();
//jmmjknssbs msbdsmndjsndmsadkjan
	}

