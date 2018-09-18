package java_fundamentals;

public class Student {
 private int rollnumber;
 private String name;
 private int standard;
 private String address;
 private int age;
 public Student()
 {
 rollnumber=12;
 name="Ankita";
 standard=10;
 address="101, Marvel Pune";
 age=16;
}
 public Student(int r,String n,int s,String a,int ag)
 {
	 rollnumber=r;
	 name=n;
	 standard=s;
	 address=a;
	 age=ag;
	 
 }
 public void show()
 {
	 System.out.println("Roll number:\t"+rollnumber+"\t Student name:\t"+name+"\t Standard:\t"+standard+"\t Address:\t"+address+"\t Age:"+age);
 }
 }
