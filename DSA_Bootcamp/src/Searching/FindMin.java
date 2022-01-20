package Searching;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {15,78,9,54,36,10,78,35};
		System.out.println(min(arr));

	}
	public static String min(int []a) 
	{
		if(a.length==0) 
		{
			return "Array Size is : 0";
		}
		int min=a[0];
		for(int i=1;i<a.length;i++) 
		{
		  if(a[i]<min) 
		  {
			 
			  min=a[i];
		  }
		}
		return "Minimum value in array is :"+min;
	}

}
