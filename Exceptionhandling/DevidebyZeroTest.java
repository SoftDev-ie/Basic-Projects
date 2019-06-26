package Exceptionhandling;

public class DevidebyZeroTest 
{
//definition of method quotient. Used to demonstrate throwing an exception
	//when a divide by zero error is encountered
	
	public static double divide(int numerator, int demoninator)
	throws MyException
	{
		if(demoninator ==0)
			throw new MyException();
		return(double) numerator/demoninator;
	
	}	//end of method divide
}
