package java_fundamentals;

public class Demo1D_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	MyClass[] objs;
		objs=new MyClass[3];
		objs[0]= new MyClass();
		objs[1]=new MyClass(12,22.33f,"we",20000,true);
		objs[2]=new MyClass(8,45.78f,"yud",3000,false);
		for(MyClass m:objs)
		{
			m.display();
			System.out.println(m.getName()+m.getSalary());
		}

	}*/
	Student[] obj;
	obj=new Student[3];
	obj[0]=new Student();
	obj[1]=new Student(1,"eda",4,"12 eon pune",10);
	obj[2]=new Student(3,"dse",5,"12 e pune",19);
	for(Student m1:obj)
	{
		m1.show();
		
	}
	}
}
