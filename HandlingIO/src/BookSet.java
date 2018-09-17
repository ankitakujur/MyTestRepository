import java.util.HashSet;
import java.util.Set;

import com.beans.Book;

public class BookSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Book> books=new HashSet<>();
		books.add(new Book());
		books.add(new Book(12,"java","enn","ddd",123f));
		books.add(new Book(42,"c++","fff","ddd",344f));
		books.add(new Book());
System.out.println(books.size());
System.out.println(books.hashCode());
	}

}
