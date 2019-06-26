package operations1;

	public class output {
	public static void main (String[]args)
	{
		System.out.println(Comp(2,3));
		int i=2;
		System.out.println(Comp(i+1,i));
	}
	private static String Comp(int x,int y)
	{ 
		String answer;
		if(x<=y)
		{
			answer = "less";}
		else
		{ answer = "not less";
		}
		return answer;
		}
}
