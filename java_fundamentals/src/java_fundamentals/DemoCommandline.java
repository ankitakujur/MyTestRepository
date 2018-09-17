package java_fundamentals;

public class DemoCommandline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("arg:"+args[0]+args[1]);
		int value1=Integer.parseInt(args[0]);
		int value2=Integer.parseInt(args[1]);
		System.out.println("you entered:"+(value1+value2));
		Integer i=new Integer(100);
		i=3;// new Integer(890) auto boxing
		//int v=i.intValue();
		 int v=i;//auto unboxing, only for wrapper classes

	}

}
