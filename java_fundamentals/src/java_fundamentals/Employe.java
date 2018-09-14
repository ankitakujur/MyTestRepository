package java_fundamentals;

public class Employe {
	  private int empID;
	  private String empName;
	  private static int empCount;
	  static
	  {
		  empCount=0;
	  }
	  public Employe()
	  {
		  empID=123;
		  empName="ewfa";
		  empCount++;
		
	  }
public Employe(int empID,String empName)

{
this.empID=empID;
this.empName=empName;
empCount++;

}
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}

public void displayEmployee()
{
	System.out.println(" EmpID :"+empID+"Empname:"+empName);
}
 public static void showCount() {
	 System.out.println("Counter:"+empCount);
	 
 }
public static void main(String[]args ) {
	Employe a=new Employe();
	Employe a1=new Employe();
	Employe a2=new Employe();
	Employe a3=new Employe();
	a.displayEmployee();
	a2.displayEmployee();
	a3.displayEmployee();
	a1.displayEmployee();
	Employe.showCount();
	
	
	
	
	
	
}

}
