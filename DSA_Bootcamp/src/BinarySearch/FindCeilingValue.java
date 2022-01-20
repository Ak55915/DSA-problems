package BinarySearch;

public class FindCeilingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {2,14,15,8,9,20};
      int ans=ceiling(arr,22);
      System.out.println("index of ceiling value is :"+ans);
      
	}
	public static int ceiling(int []a,int key) 
	{
		 //ceiling-->the value greater or equals to target.
		// but what if the target is greater than the greatest number in the array.
		if(key >a[a.length-1]) 
		{
			return -1;
			
	 	}
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
		return start;
	}

}
