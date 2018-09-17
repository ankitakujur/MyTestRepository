package java_fundamentals;

public class Demo1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array; //int array [];
array=new int [4];
array[0]=3;
array[1]=332;
array[2]=37;
array[3]=45;
//array[4]=2;
System.out.println("2nd element:"+array[1]);
int [] arr;
arr=new int[4];
for(int i=0;i<array.length;i++)
{
arr[i]=Integer.parseInt(args[i]);


System.out.println(" element:"+arr[i]);
}
/*for(int var:arr)// enhanced for loop
{
	System.out.println(var);
}*/
	}

}
