package Common;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your choice :");
		String name=sc.next();
		 switch(name)   // its conventional method to use the switch case.
		                // if you used the break key word after the each case than it exe. the matching case and come from the switch
		                // if you did not use the break than it exe. all the cases with including default case.
		                // default case is optional.
		 {
		 case "Akash":
			 System.out.println("your name is akash");
			 break;
		 case "Aniket":
			 System.out.println("your name is aniket");
			 
		 default :
		    System.out.println("enter the correct name");
		 }
		 int num=sc.nextInt();
		 System.out.println("enter the dept.");
		 
		 //******************************************************************************************************************//
		 
		 switch(num)             // Smart way of writing the switch case .
		                         // it is used when you need the break after each case.******by default break is available here.
		                         // "->" ** just use the arrow after the each case.
		 {
		 case 1->{System.out.println("is in one");
		         System.out.println("is in one");
		         switch(name) //***************************************** nested switch case.
		         {
		         case "mech"->System.out.println("is in mech");
		         case "civil"->System.out.println("is in civil");
		         default->System.out.println("no dept.");
		         }
		         }
		 case 2->System.out.println("is in two");
		 default ->System.out.println("is in default");
		 }
		 sc.close();
	}

}
