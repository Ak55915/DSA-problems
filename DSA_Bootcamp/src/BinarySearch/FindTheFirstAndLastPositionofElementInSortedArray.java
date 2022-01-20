package BinarySearch;

public class FindTheFirstAndLastPositionofElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {4,5,8,8,8,8,9,6,4};
		int target=8;
		System.out.println(binarysearch(arr,target));

	}
	public static int[] binarysearch(int []a,int key) 
	{
		int[] ans= {-1,-1};
		
		// check for first occurence of target/key
		int start = search(a,key,true);
		int end = search(a,key,false);
		ans[0]=start;
		ans[1]=end;
		return ans;
		
		
		
	}	
    
	//this function just returns the index value of target.
	public static int search(int[] a,int key,boolean findfirstpostion) 
	{
		int ans= -1;
		
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
				//potential ans found
				ans=mid;
				if(findfirstpostion) 
				{
					end=mid-1;
					
				}else {
					start=mid+1;
				}
			}
		}
		return ans;
	}
}


