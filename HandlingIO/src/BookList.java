import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.beans.Book;

public class BookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the book details");
		for(int i=0;i<1;i++)
		{
		Book o=new Book(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
        books.add(o);
		}
		Iterator<Book> it=books.iterator();
		while(it.hasNext()) {
			Book data=it.next();
			System.out.println(data);
		}
		System.out.println("enter the isbn no to be searched");
		int search=sc.nextInt();
		Book book_search=new Book();
		book_search.setIsbn(search);
		
		boolean found=books.contains(book_search);
		if(found)
		{
			System.out.println("the book is available");
		}
		else
		{
			System.out.println("sorry we dont have a copy");
		}
		System.out.println("enter the index no");
	
		int is=sc.nextInt();
	System.out.println(books.get(is));	
	System.out.println("enter isbn no and price to be updated");
	int isb=sc.nextInt();
	double Updated_price=sc.nextDouble();
	book_search.setIsbn(search);
	
	boolean found=books.contains(book_search);
	if(found)
	{
		
	}
	
		//for(Book b:books) {
			
			
			
		}
}
		
	
		
		
		/*books.add(new Book());
		books.add(new Book (34,"Core java","dsj","sajhdwei",345d));
		books.add(new Book(23,"complete refernce","fs","sder",447d));
		books.add(new Book(56,"Black book","rfe","ewrr",47d));
		System.out.println("no of books:"+books.size());
		books.add(3, new Book());
		System.out.println("book details="+books);
		Book b=books.get(2);
		System.out.println("at 2nd postion"+b.getBookName());
		boolean found=books.contains(new Book());
		if(found)
		{
			System.out.println("the book is available");
		}
		else
		{
			System.out.println("sorry we dont have a copy");
		}*/

	


