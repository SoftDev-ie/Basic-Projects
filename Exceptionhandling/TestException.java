package Exceptionhandling;

public class TestException {
	public static void main(String[] args)
	{
		System.out.println(retInt());
	}
	public static int retInt(){
		
		int a =100;
		try{
			a=a/0;
			return a;
		}
		catch(ArithmeticException e){
			System.out.println("catch called");
			System.out.println(e);
			return a;
		}
		finally{
			a =1000;
			System.out.println("Finally called");
			return a;
		
		}
		}
}
