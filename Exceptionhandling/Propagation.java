package Exceptionhandling;

public class Propagation 
{
	
	public static void main(String[] args)	
	{
		try
		{
			dividebyzero();			//propagation - dealing with a method that causes an error in another method - dividebyzero causes the error - main deals with it.
		}catch(ArithmeticException e)
		{
			System.err.println("Arithematic Exception caught");
			
		}
	
	}
	
	public static void dividebyzero() throws ArithmeticException
	{
		int val =5/0;
		System.out.println(val);
	}


}
