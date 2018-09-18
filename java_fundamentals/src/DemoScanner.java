import java.util.Scanner;
public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		//int age=Integer.parseInt(sc.nextLine());
		 int age=sc.nextInt();
		 System.out.println("enter your percentage");
		  float per=sc.nextFloat();
		  System.out.println(" your age:"+age);
		  System.out.println(" your percentage:"+per);
		  if(age<18)
			  System.out.println("welcome");
		  if(age>18)
			  System.out.println("sorry");
		
		

	}

}
