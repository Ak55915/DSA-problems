package Searching;

public class LinearSear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,3,9,8,4,7,10,15,78};
		  int key=7;
		  String str=linearSearch(arr,key);
		  System.out.println(str);

	}
    
	
	public static String linearSearch(int []a,int key) 
	 {
		 if(a.length==0) {
			 return "Array Size is :0";
		 }
		 for(int i=0;i<a.length;i++) 
		 {
			 if(a[i]==key) 
			 {
				 return "index is :"+i;
				 }
		 }
		 return "key is not found";
	 }
	 
}
