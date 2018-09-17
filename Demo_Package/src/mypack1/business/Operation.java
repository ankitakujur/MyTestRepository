package mypack1.business;

public class Operation {
	public int add(int no1,int no2)
	{
		int add=no1+no2;
		return(add);
	}
	public int max(int[] arr) {
		int max= arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return(max);
	}

}
