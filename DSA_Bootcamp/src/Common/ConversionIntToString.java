package Common;

public class ConversionIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=14;
		String b=Integer.toString(a); //1. method 
		System.out.println("By using Integer.toString method :"+b);
		
		String c=String.valueOf(a);// 2. method
		System.out.println("By using String.valueOf method :"+c);
		
		String d=String.format("%d", a); // 3. method 
		System.out.println("By using String.format(formatspecifier,variable) method :"+d);

	}

}
