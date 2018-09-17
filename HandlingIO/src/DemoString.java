
public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="citi";
System.out.println("original name="+name);
name=name.concat(",Pune");
System.out.println("new name:"+name);
StringBuffer buffer=new StringBuffer("citi");
buffer.append("hello");
System.out.println(buffer);
	}

}
