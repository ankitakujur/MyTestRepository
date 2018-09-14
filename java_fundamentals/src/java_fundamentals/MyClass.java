package java_fundamentals;

public class MyClass {
private int age;
private float percentage;
private String name;
private double salary;
private boolean isEmployed;
public void display ()
{
	System.out.println("age :"+age+"\tname:"+name);
}
public MyClass() {
	// TODO Auto-generated constructor stub() {
age=100;
percentage=12.12f;
name="CITI";
salary=10000d;
isEmployed =true;
}
public MyClass(int age,float percentage, String name, double salary, boolean isEmployed )
{
	this.age=age;
	this.percentage=percentage;
	this.name=name;
	this.salary=salary;
	this.isEmployed=isEmployed;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public float getPercentage() {
	return percentage;
}
public void setPercentage(float percentage) {
	this.percentage = percentage;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public boolean isEmployed() {
	return isEmployed;
}
public void setEmployed(boolean isEmployed) {
	this.isEmployed = isEmployed;
}

}