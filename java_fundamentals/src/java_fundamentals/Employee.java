package java_fundamentals;

public class Employee {
	private String name;
	private int age;
	public Employee()
	{
	name="Ankita";
	age=21;
				
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 public void showEmployeeDetails()
	 {
		 System.out.println("Name:\t"+name+"\tAge:"+age);
	 }
	

}
