package Common;

import java.util.Scanner;

public class OccuranceOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");  // get the number from user.
		int num=sc.nextInt();
		
		System.out.println("duplicate  number");  // targeted value.
		int dup=sc.nextInt();
		
		int count=0;
		while(num>0) // check until number is greater than 0.
		{
			int reminder=num%10; // 1. get the last digit of your number by modulo  by 10.   Ans-->178%10==8
			
			if(reminder==dup) { //2. check the reminder is equals to duplicate element.
				count++;             // if equals than increase the count.
			}
			num=num/10;        //3. reduce the number by one digit.
		}
		System.out.println("total count is :"+count);  // print the count of duplicate element.
       sc.close();
	}

}
