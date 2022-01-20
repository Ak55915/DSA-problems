package Common;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		String str="Akash";
		String str2="";
		
		for(int i=str.length()-1;i>=0;i--) {
			str2=str2+str.charAt(i);   // charAt method to reverse the string.
		}
		System.out.println(str2);
	}

}
