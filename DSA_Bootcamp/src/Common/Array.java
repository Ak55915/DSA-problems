package Common;

public class Array {
  int []arr;
  
  public static void swap(int []a ,int i,int j) {           // code for swap the element in the array. 
	  int temp=a[i];
	  a[i]=a[j];
	  a[j]=temp;
	  
  }
  
  public static  void display(int[]arr)                     // code for displaying the 1D array.
  {
	  for(int i=0;i<arr.length;i++) 
	  {
		  System.out.println(arr[i]);
		  
	  }
  }
	
}
