package BinarySearch;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int orderAgnostic(int []a,int key) 
	{
		int start=0; //start
		int end=a.length-1;//end
		
		//find the array wether the is in acending or decending order?.
		boolean isAsc = a[start] < a[end];
		
		while(start<=end) 
		{
			int mid = start + (end - start)/2;  // if we take (start+end)/2 than there is some chances to excced the range of integer
			                                        // if there is large number of elements in array.
			 if(a[mid]==key) {
				   return mid;                                   // 2. find the mid
			 }
			 
			if(isAsc) {
					if(a[mid]>key)    // 3.check where the element is present
					{
						end=mid-1;
						
					}else  
					{
						start = mid + 1;
						
					}
			}else 
			{
					if(a[mid]<key)    // 3.check where the element is present
					{
						end=mid-1;
						
					}else  
					{
						start = mid + 1;
						
					}
			}
		
		
		}
		return -1;
		
	}

}
