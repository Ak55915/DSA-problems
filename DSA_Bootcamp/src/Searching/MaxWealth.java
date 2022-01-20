package Searching;

public class MaxWealth {

	public static void main(String[] args) {
		int [][]arr= 
			{
					{15,8,7,9},
					{2,3,1,1}
			};
		System.out.println(maxwealth(arr));

	}
	public static int maxwealth(int [][]a) 
	{
		//person - row.
		//account - column.
		int max=0;  // take max wealth.
		for(int person=0;person<a.length;person++) 
		{
			
			int persum=0;  // take sum for each row.
			for(int account=0;account<a[person].length;account++) 
			{
				persum+=a[person][account];
			}
			if(max<persum) // check the sum compare with max .
			{
				max=persum;
			}
		}
		return max;
	}

}
