package Exceptionhandling;

public class Divisionbyzero {

	public static void main(String[] args) throws MyException {
	{
		
		int a = 10;
		int b = 0;
		
			
		try
		{
			if(b==0){throw new MyException();}
		double result = a/b;
		System.out.print(result);
		
		}
	
		catch(MyException Ae) {
		System.out.print(Ae);
		Ae.printStackTrace();
		}
	}
}
}
class MyException extends Exception
{
	String ex = "Devide by zero is not allowed";
	
	MyException(){
		super(" You Cannot do that ");
	}
	MyException (String x){
		this.ex = x;
	}
}




