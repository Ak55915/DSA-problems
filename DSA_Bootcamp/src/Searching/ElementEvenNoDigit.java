package Searching;

public class ElementEvenNoDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {14,78,963,1,7894};
		System.out.println(FindDigit(arr));

	}
	public static int FindDigit(int []a) 
	 {
		 int count=0;
		 if(a.length==0) 
		 {
			 return -1;
		 }
		 for(int i=0;i<a.length;i++) 
		 {
			 if(digit(a[i])%2==0) // it check the digit count is even or not.
			 {
				 count++;
				 
			 }
		 }
		 return count;
	 }
	 public static int digit(int n)                 // 1.By counting the each digit of element
	 {
		 if(n<0)   // if number is negative.
		 {
			n=n*-1; 
		 }
		 int cnt=0;
		while(n>0) 
		{
			cnt++;
			n=n/10;  // it decrease the digit by 1 on dividing by 10.
		}
		return cnt;
	 }
	 
	 public static int digit2(int n)                  // 2. By using math class with log10 method
	                                                  // it returns the digit count.
	 {
		 if(n<0)   // if number is negative.
		 {
			n=n*-1; 
		 }
		 return (int)(Math.log10(n))+1;
		 
		 
	 }
	 
	 
	 public static int digit3(int n)                 // 3. By converting the integer to String
	                                                  // use the String.length() method for number of digit.
	 {
		 String s=String.valueOf(n);
		 int a=s.length();
		 return a;
	 }


}
