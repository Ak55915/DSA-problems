package Common;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence ="Akash to gsdc ssdg asdfhg dafh Kadam";
		
		String [] num=sentence.split(" ");  // Extract Each Word.
		 
		int  count=0;
		
		for(String s:num) {
			count++;
			
		}
         
		System.out.println(count);
	}

}
