package Common;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str="Akash welcome to new world";
		String reversString="";
		
		
		String [] word=str.split(" "); // sentence converted into words. 
		
		for(String w:word) {  // for each word.
			
			String revWord="";  
			
			
			for(int i=w.length()-1;i>=0;i--) {  // reverse the each word .
				
				revWord+=w.charAt(i);
			}
			
			
			reversString=reversString+revWord+" ";  // after reversing each word stored it in reverseString.
			
			
			
		}
		System.out.println(reversString);


	}

}
