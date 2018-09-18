import com.exceptions.MyException;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min_bal=100;
		try
		{
		if(min_bal<1000) {
			throw new MyException("balance is less than 1000");
		}else {
			System.out.println("your balance is within limit");
		}
		}
		catch(MyException e)
		{
			//e.display();
			e.printStackTrace();
		}
		
}
	
}