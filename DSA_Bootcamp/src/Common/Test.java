package Common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

abstract class Test {
	
	 
	
	 
	
	
		 /*public static void main (String []args) 
		 {
			String sentence ="Akash to gsdc ssdg asdfhg dafh Kadam";
			
			String [] num=sentence.split(" ");
			
			int  count=0;
			for(String s:num) {
				
				count=count+s.length();				
			}
             System.out.println(count);
			/* int [] arr= {1,3,2,4};
			 int size=arr.length;
             
             Stack<Integer> s = null;
             Vector<Integer> v = null;
             
             for(int i=size-1;i>=0;i--) 
             {
            	 if(s.size()==0) {
            		 v.add(-1);
            		 
            	 }
            	 else if (s.size()>0 && s.pop()>arr[i]) 
            	 {
            		 
            	 }
             }*/
	public static int[] swap(int []a) {
		int start=0;
		int end =a.length;
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
		}
		
		return a;
	}
             
			public static void main(String []args) {
				int []arr= {1,2,3,4,5};
				
			}
		 

}
