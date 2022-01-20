package Searching;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []arr= {17,8,9,6,3,4,78};
     int key =4;
     int start=1;
     int end=6;
     System.out.println(range(arr,key,start,end));
     
     
	}
	
	public static boolean range(int []a,int key,int start,int end) // here just add the start and end index.
	{
		if(a.length==0) 
		{
			return false;
		}
		for(int i=start;i<=end;i++) 
		{
			if(a[i]==key) 
			{
				return true;
				
			}
		}
		return false;
	}

}
