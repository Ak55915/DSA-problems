package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {7,8,9,6,5};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void bubble(int []a) 
	{
		boolean swapped;
		
		//1. run the loop for the number of passes.
		// outer loop--> n-1.
		for(int i=0;i<a.length;i++) 
		{
			swapped=false;
			
			// 2.for each step ,max item will come at the respective index.
			// inner loop-->n-i-1.
			// a.length-1==n-1
			for(int j=1;j<a.length-i;j++) 
			{
				//3. swapping the item after check
				if(a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					swapped=true;
				}
				
			}
			// if you did not swapeed for particular value of i than array is sorted.
			// it is optimize way of bubble sort.
			// its a provision for already sorted array.
			
			if(!swapped) //!false ==true.
			{
				break;
				
			}
		}
	}

}
