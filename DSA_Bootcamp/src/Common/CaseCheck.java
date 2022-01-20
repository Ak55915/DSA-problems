package Common;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charecter :");
		char ch=sc.next().trim().charAt(0);
		System.out.println(ch);
		
		if(ch=='a' && ch=='z') {
			System.out.println("is in lower case ");
			
		}else {
			System.out.println("is in upper case ");
	}
		sc.close();
	}
}
