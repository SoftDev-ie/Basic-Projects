package Arrays; //array program with error exception.

public class ValArray {
	public static void main(String[] args)
	{
		int[] nums = {3,2,6,1};
		badUse(nums);
	}
	public static void badUse(int[] vals)
	{
		int total = 0;
		try
		{
			for(int i =0; i < vals.length; i++)
			{
				int index = vals[i];
				total += vals [index];
			}
		}
		catch(Exception e) {total =-1;}
		System.out.println(total);
	}
}
