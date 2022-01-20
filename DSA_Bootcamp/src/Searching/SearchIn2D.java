package Searching;

public class SearchIn2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= 
			{
					{47,8,9,7},
					{17,89,26}
					
			};
		int target =7;
		System.out.println(find(arr,target));

	}
	public static String find(int [][]a,int key) 
	{
		if(a.length==0) 
		{
			return "Array Size is :0";
	    }
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)   // a[i].length--> becoz 2d array contain array. its just like array of array.
				                             // a[0].length--> length of each row.
			{
				if(a[i][j]==key) 
				{
					return "Element is at index : "+i+","+j;
				}
				
			}
		}
		return "Element is not found";
	
	}

}
