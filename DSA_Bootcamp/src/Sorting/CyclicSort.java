package Sorting;

import Common.Array;

public class CyclicSort extends Array {
	
	public static void sort(int []arr) 
	{
		int i=0;
		while(i<arr.length) 
		{
			int correctIndex=arr[i]-1;  //   *****when the given range from 1 to N.*******
			                            //***** if the given range is from 0 to N. than -- correctindex = arr[i]******
			if(arr[i]!=arr[correctIndex]) //******arr[i]<arr.length---another condition to find missing number.
			{
				swap(arr,i,correctIndex);
			}else 
			{
				i++;
			}
		}
	}

	public static void main(String[] args) {
		int []arr= {10,20,45,1,7,6};
		try 
		{
		sort(arr);
		display(arr);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}

	}

}
