package BinarySearch;

public class BinarySearch1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* to apply binary search required sorted order*/
		
		int []arr= {1,2,3,4,5,6,7,8,9,45,85,96,996,8552,77859};
		int target=996;
		int ans=binarysearch(arr,target);
		System.out.println(ans);
		

	}
	public static int binarysearch(int []a,int key) 
	{
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
		return -1;
	}

}
