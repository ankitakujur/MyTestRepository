import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import com.pojo.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

try {
	FileOutputStream fo=new FileOutputStream("person.txt");
	ObjectOutputStream o=new ObjectOutputStream(fo);

Person[] a= new Person[2];
for(int i=0;i<a.length;i++)
{
	System.out.println("For"+i+"employee:");
	System.out.println("ID");
	System.out.println("Name:");
	System.out.println("Address:");
	System.out.println("Age:");
	int x=Integer.parseInt(br.readLine());
	String y=br.readLine();
	String y1=br.readLine();
    int z=Integer.parseInt(br.readLine());
	 a[i]=new Person(x,y,y1,z);
}
for(int i=0;i<a.length;i++)
{
	 o.writeObject(a[i]);
}

o.close();
fo.close();
System.out.println("file written ");
	}
catch(IOException e)
{e.printStackTrace();
	}
}
}


