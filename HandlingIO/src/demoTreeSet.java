import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.beans.Book;

public class demoTreeSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Book> books=new TreeSet<>(new BookComparator());
		books.add(new Book());
		books.add(new Book(12,"java","enn","ddd",123f));
		books.add(new Book(42,"c++","fff","ddd",344f));
		books.add(new Book());
System.out.println(books.size());
System.out.println(books);

}}
