import java.util.Comparator;

import com.beans.Book;

public class BookComparator implements Comparator {

	@Override
	public int compare(Object arg0,Object arg1) {
		// TODO Auto-generated method stub
		Book b1=(Book)arg0;
		Book b2=(Book)arg1;
		return  (int) (b1.getPrice()-b2.getPrice());
		//return b1.getIsbn()-b2.getIsbn();
	}

	
}
