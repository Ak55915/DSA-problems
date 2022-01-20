package Common;

public class Wraperclass {

	public static void main(String[] args) {
		 Integer a=10;
		  Integer b=30;    // in java there is no concept like call by referance because there is no pointer.
		                   //---when you pass values of coping refrance variable  still dont swap 
		                   // becoz of integer calss(its wrapper class ) having fianl key word..
		  swap(a,b);
		  System.out.println(a+" "+b);
		  
	}
	  public static  void swap(Integer i,Integer j) 
	  {
		  Integer temp=i;
		  i=j;
		  j=temp;
		  System.out.println(i+" "+j);

	}

}
