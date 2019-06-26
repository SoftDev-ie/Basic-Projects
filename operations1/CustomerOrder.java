package operations1;

import java.util.Scanner;

public class CustomerOrder {
	static int item;
	static double cost;
	static String phone;
	static String email;
	
	
	public static void main(String[] args){
		menu();
		input();
		
		}
		static void menu()
			{
			System.out.print("---------------- \n 1----DOLL \n 2----CAR \n 3---- TRUCK \n");
			}
		static void input()
			{
			
			Scanner user_input = new Scanner(System.in);
			System.out.println("enter the item you want to buy");
			item = user_input.nextInt();
			System.out.println("enter your phone number");
			phone= user_input.next();
			System.out.println("enter your email");
			email= user_input.next();
			user_input.close();
		   
		   switch (item)
		    { 
					 
			 case 1:cost= calculate(item); break;
			
			 case 2: cost = calculate(phone); break;
			 
			 case 3: cost = calculate(); break;
			 
			 
		    }
		   System.out.println("the total of your order is " +cost);
			}
			
		static double calculate(int x)
		{
		
			double y = 150.70;
			return y;
		}
		
		static double calculate(String x)
		{
			double y = 200;
			return y;
		}
		
		static double calculate()
		{
			double y = 174.30;
			return y;
		}
		
		


}
