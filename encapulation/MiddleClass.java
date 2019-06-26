package encapulation;

import java.util.Scanner;

public class MiddleClass extends SuperClass
	{
	
	
		public void input()
	{
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter a number");
		int temp= user_input.nextInt();
		
		user_input.close();

		setnumber(temp);

	}
		public void output()
	{
		
		System.out.print("your number is "+ getnumber());
		
	}
}


