package Searching;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {15,78,9,54,36,10,79,35};
		System.out.println(max(arr));
	}
	public static String max(int []a) 
	{
		if(a.length==0) 
		{
			return "Array Size is : 0";
		}
		int max=a[0];
		for(int i=1;i<a.length;i++) 
		{
		  if(max<a[i]) 
		  {
			 
			  max=a[i];
		  }
		}
		return "Maiximum value in array is :"+max;
	}
}
