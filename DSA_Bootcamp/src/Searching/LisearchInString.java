package Searching;

public class LisearchInString {

	public static void main(String[] args) {
		String name="Akash";
		char target='s';
		System.out.println(search(name,target));

	}
	
	public static boolean search(String str,char key) 
	{
		if(str.length()==0) 
		{
			return false;
		}
		for(int i=0;i<str.length();i++) 
		{
			if(key==str.charAt(i)) 
			{
				return true;
			}
		}
		return false;
	}

}
