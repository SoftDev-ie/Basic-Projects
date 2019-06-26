package encapulation;

import java.util.Scanner;

public class Inputpassword 
	{

		public static void main(String[] args) {
		
			input();
		
	}
		public static void input()
		{
		
			Password ob= new Password(); 
		
			Scanner user_input = new Scanner(System.in);
			System.out.print("Enter the password");
			int temp= user_input.nextInt();
			
			user_input.close();
		
			ob.check(temp);
		
		}
}
