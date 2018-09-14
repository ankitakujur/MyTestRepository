package java_fundamentals;

public class Demo2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] elements=new int[3][];
elements[0]=new int[3];
elements[0][0]=1;
elements[0][1]=12;
elements[0][2]=13;
elements[1]=new int[1];
elements[1][0]=34;
elements[2]=new int[5];
elements[2][0]=14;
elements[2][1]=10;
elements[2][2]=51;
elements[2][3]=16;
elements[2][4]=12;

for(int[] i:elements)
{
 for(int j:i)
	{
		System.out.print(j+"\t");
	}
	System.out.println();
}
}
}