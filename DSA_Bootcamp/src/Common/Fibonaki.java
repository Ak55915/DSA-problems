package Common;

public class Fibonaki {

	public static void main(String[] args) {
       int a=0;
       System.out.println(a);
      
       int b=1;
       System.out.println(b);
       int n=15;                   /// you can take from user to print upto nth fibonachi numbers.
       
       for(int i=3;i<=n;i++) {
    	   int c=a+b;
    	   System.out.println(c);
    	   a=b;
    	   b=c;
    	   
       }

	}

}
