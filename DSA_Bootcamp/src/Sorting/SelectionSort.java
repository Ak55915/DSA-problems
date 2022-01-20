package Sorting;

import java.util.Arrays;



public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {15,7,89,3,6,72};
		selection(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void selection(int []a) 
	{
	   for(int i=0;i<a.length-1;i++) {
		   int min =i;
			for(int j=0;j<a.length;j++) 
			{
				if(a[j]<a[min]) 
				{
					min=j;
				}
			}
			if(min!=i) 
			{
				swap(a,i,min);
			}
	   }
	}
	
	static void swap(int []a,int first ,int second) 
	{
		int temp=a[first];
		a[first]=a[second];
		a[second]=temp;
		
	}
	
	
	

}
