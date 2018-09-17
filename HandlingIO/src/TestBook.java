import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Reader;

import com.beans.Book;
import com.io.BookPersistence;
import com.io.BookPersistenceImpl;

public class TestBook {
	public static void main(String[] args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
	Book[] b= new Book[2];
	System.out.println("enter the details of the book");
	for(int i=0;i<b.length;i++)
	{
		System.out.println("ISBN BookName Publication AuthorName and Price");
		 b[i]=new Book(Integer.parseInt(br.readLine()),br.readLine(),br.readLine(),br.readLine(),Double.parseDouble(br.readLine()));
	}
	
	System.out.println("Enter 1 for showing all book\n2 Find book by ISBN \n 3 find book by name \n 4 find book by author name");
	int a= Integer.parseInt(br.readLine());
		if(a==1) {
		BookPersistenceImpl c=new BookPersistenceImpl();
		Book[] d= new Book[2];
		d=c.readBooks();
		}
	}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
}
} 