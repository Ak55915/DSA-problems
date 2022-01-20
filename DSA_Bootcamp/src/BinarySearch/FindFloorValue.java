package BinarySearch;

public class FindFloorValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr= {2,14,15,8,9,20};
	      int ans=floor(arr,1);
	      System.out.println("index of floor value is :"+ans);
	}
	public static int floor(int []a,int key) 
	{
		// floor--> the value smaller or equal to target.
		int start=0; //start
		int end=a.length-1;//end         1. set the range
		
		while(start<=end) 
		{
			int mid = start + (end - start)/2;  // if we take (start+end)/2 than there is some chances to excced the range of integer
			                                        // if there is large number of elements in array.
			                                         // 2. find the mid
			
			if(a[mid]>key)    // 3.check where the element is present
			{
				end=mid-1;
				
			}else if(a[mid]<key) 
			{
				start = mid + 1;
				
			}else 
			{
				return mid;
			}
		}
		return end;
	}

}
