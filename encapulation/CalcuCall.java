package encapulation;

import java.util.Scanner;

public class CalcuCall extends Cal
{
	public static void main(String[] args)
	{
	input();
	}
	
	public static void input()
	{
		double answer;
		
		
		CalcuCall ob = new CalcuCall();
			
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter 1 to add, 2 to subtract, 3 for multiplication and 4 for Division");
		int choice= user_input.nextInt();
		System.out.print("the first number");
		int a= user_input.nextInt();
		System.out.print("the Second number");
		int b= user_input.nextInt();
		
		user_input.close();
		answer=ob.decide(a,b,choice);
		System.out.println("the answer is " + answer); 
		
 }
		
		
	public double decide(int a,int b,int choice)
	{
		double answer = 0;
		switch (choice)
	    { 
				 
		 case 1: answer=add(a,b); break;
		
		 case 2: answer=subtract(a,b); break;
		 
		 case 3:answer=multiplication(a,b); break;
		 
		 case 4:answer =division(a,b); break;
	    }
		return answer;
	
	}
}
